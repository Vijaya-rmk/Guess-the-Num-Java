import java.util.*;
public class Guess{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
      char ans;
        do{
        System.out.println("Choose game difficulty level 1-Easy 2-Medium 3-Difficult");
        int ch=s.nextInt();
        int maxtrials=0;
        int range=0;
        switch(ch){
            case 1:
                range=100;
                maxtrials=10;
                break;
            case 2:
                range=250;
                maxtrials=8;
                break;
            case 3:
                range=500;
                maxtrials=7;
                break;
            default:
                System.out.println("Invalid Choice please enter 1 or 2 or 3");
        }
    
        int toGuessNumber= random.nextInt(range)+1;
        System.out.println("Start gussing the Number You have "+(maxtrials+1)+" trials");
        System.out.println("Guess Range is from 1 to "+range);
        int num=s.nextInt();
        int trials=0;
        while(num!= toGuessNumber && trials<=maxtrials){
            if(num<toGuessNumber){
                System.out.println("Guess is LOW");
            }
            if(num>toGuessNumber){
                System.out.println("Guess is HIGH");
            }
              trials++;
              System.out.println("your remaing trails : "+(maxtrials-trials)+" / so use it wisely!");
            num=s.nextInt();
        }
        if(num==toGuessNumber){
            System.out.println("YAY!!! You got it with in the trial limits You are Genius");
        }
        else{
            System.out.println("OOPS!!! trials limit reached, No Worries lets try again");
        }
          System.out.println("Do you want to continue : press y or n");
        ans=s.next().charAt(0);
    }while(ans=='y');
        
    }
}
