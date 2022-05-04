package zHOMEWORK;

import java.util.Scanner;

public class h18_April1 {
    public static void main (String[]args){


    Scanner sc = new Scanner(System.in);

    int number = 1 + (int)(100
            * Math.random());

    int Trials = 5;
    int i, guess;

        System.out.println("A number is chosen between 1 to 100. Guess the number in 5 trials.");

            for (i = 0; i < Trials; i++) {
        System.out.println("Guess the number:");
        guess = sc.nextInt();

        if (number == guess) {
            System.out.println("Congratulations! You guessed the correct number.");
            break;
        }
        else if (number > guess
                && i != Trials - 1) {
            System.out.println("The number is greater than " + guess);
        }else if (number < guess
                && i != Trials - 1) {
            System.out.println("The number is less than " + guess);
        }
    } if (i == Trials) {
        System.out.println("You have used all of your chances for trials.");
        System.out.println("The number was " + number);
    }

}
}

