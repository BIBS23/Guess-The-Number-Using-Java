import java.util.*;

public class Guessno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to guess :");
        int NoOfChance = sc.nextInt();
        int randomno = 1 + (int) (Math.random() * 100);
        int i=1;
        do {
            System.out.println("No Of Chance : " + i++);
            System.out.println("Enter the Guess number :");
            int guessno = sc.nextInt();
            if (guessno == randomno) {
                System.out.println("Congratulations!!! You Won");
                break;
            } else if (guessno > randomno) {
                System.out.println("guess is greater than random number");
                System.out.println("You  Lose");    
            } else if (guessno < randomno) {
                System.out.println("guess is less than random number");
                System.out.println("You  Lose");
            }if (i>NoOfChance) {
                System.out.println("Actual number is : " + randomno);
            }
        }while(i<=NoOfChance);
    }

}
