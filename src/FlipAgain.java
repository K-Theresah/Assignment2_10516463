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
public class FlipAgain {
    public static void main( String[] args )
	{
           /*
               3. The code works perfectly. The program still works.
                  This is because the body of the do while loop is executed
                   at least once. Hence the program works even if the String
                   again is not initialised at the point of declaration.
            */
		Scanner keyboard = new Scanner(System.in);
		Random rng = new Random();

		String again;
                /*int x = rng.nextInt(2);
                
                if ( x == 0)
                {
                System.out.println("You flip a coin and it is ...... TAILS");
                }
                else
                {
                 System.out.println("You flip a coin and it is ...... HEADS");  
                }
                
                System.out.println("Would you like to flip again? (y/n)");
                again = keyboard.next();*/
                
		do
		{
			int flip = rng.nextInt(2);
		String coin;

			if ( flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			System.out.print( "Would you like to flip again (y/n)? \n" );
			again = keyboard.next();
		}while ( again.equals("y") );
	}
    
}
