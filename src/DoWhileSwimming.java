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

public class DoWhileSwimming{


    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);

        String swimmer1 = "GALLANT";
        String swimmer2 = "GOOFUS ";

        double minimumTemp = 79.0; // degrees Fahrenheit+        
        double currentTemp;
        double savedTemp;
       int swimTime;

        System.out.print("What is the current water temperature? ");
        currentTemp = keyboard.nextDouble();
        savedTemp = currentTemp; // saves a copy of this value so we can get it back later.

        System.out.println( "\nOkay, so the current water temperature is " + currentTemp + "F." );
       System.out.println( swimmer1 + " approaches the lake...." );

        swimTime = 0;
        while ( currentTemp >= minimumTemp )
        {
            System.out.print( "\t" + swimmer1 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600); // pauses for 600 milliseconds
            currentTemp -= 0.5; // subtracts 1/2 a degree from the water temperature
            System.out.println( "\tThe current water temperature is now " + currentTemp + "F." );
        }

        System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

        currentTemp = savedTemp; // restores original water temperature

        System.out.println( "\nOkay, so the current water temperature is " + currentTemp + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do
        {
            System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            Thread.sleep(600);
            currentTemp -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemp + "F." );

        } while ( currentTemp >= minimumTemp );
        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
    }
}
/*
Q1
Ans: GALLANT swims for 3 mins but GOOFUS swims for  4 mins
Q2
Ans: GALLANT swims for 0 mins and GOOFUS swims for 1 min
Q3    
Ans: Gallant checks the water temperature first before he dives in the water.
Q4
Ans: Goofus dives in the water first before checking the water temperature.
Q5
Ans: In the "do-while" loop the statements are executed once before the test is made 
     but the while loop performs the tests first before execution of the statements.
Q6
Ans: The "do-while" loop is called a "pre-test loop" and the "while" loop is called a "post-test loop".
*/