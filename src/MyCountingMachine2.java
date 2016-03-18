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
public class MyCountingMachine2 {
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Count from: ");
        int from = keyboard.nextInt();
        System.out.print("Count to  : ");
        int to = keyboard.nextInt();
        System.out.print("Count by  : ");
        int by = keyboard.nextInt();
        for(int i = from; i <= to; i += by)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
