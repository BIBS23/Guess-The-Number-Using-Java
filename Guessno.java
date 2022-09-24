import java.util.*;
public class Guessno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to guess :");
        int NoOfChance = sc.nextInt();
        int randomno = 1 + (int) (Math.random() * 100);
        for (int i = 1; i <= NoOfChance; i++) {
            System.out.println("Enter the Guess number :");
            int guessno = sc.nextInt();
            if (guessno == randomno) {
                System.out.println("Congratulations!!! You Won");

            }
            else if (guessno > randomno) {
                System.out.println("guess is greater than random number");

            }
            else {
                System.out.println("You Lose");
            }

        }
    }

}
