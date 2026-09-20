import java.util.*;
public class Guess{
    public static void main(String[] args) {
        Random random = new Random();
        int toGuessNumber= random.nextInt(100)+1;
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int trials=0;
        while(num!= toGuessNumber){
            if(num<toGuessNumber){
                System.out.println("LOW");
            }
            if(num>toGuessNumber){
                System.out.println("HIGH");
            }
            num=s.nextInt();
            trials++;
        }
        System.out.println("YAY!!! u found and u took "+trials+" trials :)");
    }
}
