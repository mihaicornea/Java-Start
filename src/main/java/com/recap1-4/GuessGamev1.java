package com.session5;

import java.util.Scanner;

/*7. Guess the number: Ask the user to guess the number, they have 4 tries to guess a number between 1 and 20.
Everytime they fail you give a clue about their guess, higher if they guessed too low, lower if they guessed too high*?

1. Gaseste diferentele
2. Gaseste eroarea
3. Fix eroarea
 */
public class GuessGamev1 {
    public static void main(String[] args) {
        //Creeam scannerul cu care citim inputul dat de utilizator
        Scanner scannerGame = new Scanner(System.in);
        int secretNumber = 10;
        int tries = 4;
        while (tries > 0) {
            System.out.println("Guess the number ? (you have " + tries + " tries):");
            int guess = scannerGame.nextInt();
            tries -= 1;
            //Daca guess > secret number printam cuvant ajutator
            //Daca guess < secret number printam cuvant ajutator
            if (guess > secretNumber) {
                System.out.println("Try lower number !");
            }
            else if (guess < secretNumber) {
                System.out.println("Try higher number !");
            }
            else {
                System.out.println("Congratulations ! You have won !");
                break;
            }
        }
        System.out.println("Thank you for playing ! You exhausted your number of tries ! LOOOSER");
    }
}
