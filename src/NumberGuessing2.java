/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theresahk
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rn = new Random();
        int guess, tries = 0;
        int random = 1 + rn.nextInt(10);
        tries++;
         do{
             System.out.print("I have chosen a number between 1 and 10. Try to guess it.\nYour guess: ");
             guess = keyboard.nextInt();
             if ( guess != random){
                System.out.print("That is incorrect. Guess again. ");
               tries++;
             }
        }while (random != guess);
        System.out.println("That's right! You're a good guesser");
        System.out.printf("It only took you %d tries.\n", tries);

    }
    
}
