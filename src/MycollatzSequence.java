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
public class MycollatzSequence {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int n, kount = 0;
        
        System.out.println("Starting number: ");
        n = keyboard.nextInt();
        
        while(n != 1)
        {
            if(n%2 == 0)
            {
                n = n/2;
            }
            else
            {
                n = 3*n + 1;
            }
            if ( kount > 9 && (kount%10 == 0) )
            {
                System.out.println();
            }
            System.out.print(n + "  ");
            kount++;
        }
    }
} 
