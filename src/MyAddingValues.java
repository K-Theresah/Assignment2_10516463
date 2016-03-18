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
public class MyAddingValues {
     public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        int n, c=0;
        System.out.println("Number: ");
        n = keyboard.nextInt();
        
        for (int i = 1; i<=n; i++){
            System.out.print(i + "  ");
            c += i;        
        }
        System.out.println("\nThe sum is " + c +"." );
    }
}

