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
public class Dice {
    public static void main(String [] args){
        Random rn = new Random();
        int x = rn.nextInt(6) + 1, y = rn.nextInt(6) + 1; 
        
        System.out.println("HERE COMES THE DICE!");
        System.out.println("ROLL #1: " + x + "!");
        System.out.println("ROLL #2: " + y + "!");
        System.out.println("The total is " + (x+y) + "!");
    }
}
