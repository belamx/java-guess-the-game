package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() *10) + 1;
        int guessedAttempts = 0;

        boolean guessedCorrectly = false;

        while(!guessedCorrectly){
            int guessNum = scanner.nextInt();

            if(guessNum != randomNum){
                guessedAttempts++;
                System.out.println("Try again");
            }
            else {
                System.out.println("Got it");
                System.out.println("Attempted attempts:" + " " + guessedAttempts);
            }
        };
    }


}
