import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

class GuessGame{
    public int num;
    public int inputNumber ;
    public int noOfGuess;

    boolean gamecontent() {
        System.out.println("Ready to play Number guessing game..\n ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter in how many attempts you want to try to guess number : ");
        int noOfGuess = scan.nextByte();

        Random rand = new Random();
        num =rand.nextInt(100);

        for (int i = 1; i<=noOfGuess ;i++){
            System.out.println("Guess the Number");
            int inputNumber = scan.nextInt();

            if (inputNumber == num){
                System.out.println("You guessed it Right the number is : "+num);
                System.out.println("You guessed the number in "+i+" try ");
                return true;

            } else if (inputNumber>num) {
                System.out.println("Too High..");

            } else if (inputNumber<num) {
                System.out.println("Too Low..");

            }
        }
        System.out.println("You Loose the game");
        return false;
    }
}

public class Number_Guessing_Game extends GuessGame {
    public static void main(String[] args) {

        int noOfGuess;
        int numb = 5;
        int zero =0;

        Scanner scan = new Scanner(System.in);
        GuessGame g1 =new GuessGame();
        boolean answer = g1.gamecontent();

        System.out.println("For play again press "+numb+" for exit press "+zero);
        int enternumb= scan.nextInt();
        if (enternumb == numb){
            g1.gamecontent();
        }

    }
}
