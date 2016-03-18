/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Theresahk
 */
import java.util.Scanner;
public class MyCountingMachine {
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count to: ");
        int kount = keyboard.nextInt();
        for(int i = 0; i <= kount; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
 }


}