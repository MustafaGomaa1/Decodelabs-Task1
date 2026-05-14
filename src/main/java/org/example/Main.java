package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean wantToPlay = true;
        int hiddenNumber;
        int attempt;
        int userInput;
        int score = 0;
        String userWantToPlay;
        try {
            while (wantToPlay) {
                attempt = 10;
                hiddenNumber = random.nextInt(1, 100);
                System.out.println("Guess The Hidden Number :(*note: you have only " + attempt + " Attempts)");
                for (int i = attempt; i > 0; i--) {
                    userInput = sc.nextInt();
                    if (userInput == hiddenNumber) {
                        System.out.println("Congrats, You Got It.");
                        score++;
                        System.out.println("You win\nWant To Play Again[Y,N] :");
                        userWantToPlay = sc.next();
                        if (userWantToPlay.toUpperCase().charAt(0) == 'N') {
                            System.out.println(":(");
                            wantToPlay = false;
                            break;
                        } else {
                            System.out.println("That's Good News Let's Start....");
                            break;
                        }
                    } else if (userInput > hiddenNumber && attempt > 0) {
                        System.out.println("Too High " + (i - 1) + " Attempts Left");
                        attempt--;
                    } else if (userInput < hiddenNumber && attempt > 0) {
                        System.out.println("Too Low " + (i - 1) + " Attempts Left");
                        attempt--;
                    }
                    if (attempt == 0) {
                        System.out.println("Bad Luck \nDo You Want To Try Again[Y,N]");
                        userWantToPlay = sc.next();
                        if (userWantToPlay.toUpperCase().charAt(0) == 'N') {
                            System.out.println(":(");
                            wantToPlay = false;
                            break;
                        } else {
                            System.out.println("That's Good News Let's Start....");
                        }
                        break;
                    }
                }
                System.out.println("The Hidden Number Is: " + hiddenNumber);
                if (!wantToPlay)
                    break;
            }
            System.out.println("Your Final Score :" + score);
            System.out.println("Thank You For Playing :)");
        } catch (Exception ex) {
            System.out.println("Invalid Input Type");
        }
        sc.close();
    }
}
