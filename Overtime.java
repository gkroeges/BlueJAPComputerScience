/* constants:
 *      overtime multiplier
 * inputs:
 *      hourly wage
 *      daily regular hours
 *      daily overtime hours
 * outputs:
 *      pay from regular hours
 *      pay from overtime
 *      total pay(final output)
 */

import java.util.Scanner;

public class Overtime
{
    public static void main(String [] args)
    {
        
        //instantiate variables
        final double OVERTIME_MULT = 1.5;
        double wage;
        int regHours = 0, overtimeHours = 0;
        double totalPay;
        Scanner reader = new Scanner(System.in);
        
        //get the hourly wage to begin
        System.out.println("What is the normal pay per hour(double): ");
        wage = reader.nextDouble();
        
        // for loop goes through the five days, getting inputs for each day, and adding them to running total
        for(int i = 0; i < 5; i++)
        {
            System.out.println("How many regular hours were worked on day #" + (i+1) + " (int):");
            regHours += reader.nextInt();   // adds however many hours were worked on the day to the running total
            System.out.println("How many overtime hours were worked on day #" + (i+1) + " (int):");
            overtimeHours += reader.nextInt();  //adds however many hours were worked on the day to the running total
        }
        
        //perform the calculations and output
        totalPay = wage*regHours + wage*OVERTIME_MULT*overtimeHours;
        System.out.println("Total Pay: " + totalPay);
    }
}
