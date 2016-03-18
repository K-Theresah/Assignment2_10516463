/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theresahk
 **/
import java.util.Scanner;
public class MyCountingWhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Type in a message, and I'll display it several times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.print("How many times?  ");
        int iterations = keyboard.nextInt();

        int n = 0;      
        while (n < iterations)
        {
            System.out.println(((n + 1) * 10) + ". " + message);
            n++;
        }

    }
    
}
