/* constants:
 *      overtime multiplier
 * inputs:
 *      hourly wage
 *      total regular hours
 *      total overtime hours
 * outputs:
 *      pay from regular hours
 *      pay from overtime
 *      total pay(final output)
 */

import java.util.Scanner;

public class Pay
{
    public static void main(String [] args)
    {
        
        //instantiate variables
        final double OVERTIME_MULT = 1.5;
        double wage;
        int regHours, overtimeHours;
        double totalPay;
        Scanner reader = new Scanner(System.in);
        
        //get inputs
        System.out.print("Enter normal hours(integer): ");
        regHours = reader.nextInt();
        System.out.print("Enter overtime hours(integer): ");
        overtimeHours = reader.nextInt();
        System.out.print("Enter hourly wage(double): ");
        wage = reader.nextDouble();
        
        //calculate and output
        totalPay = wage*regHours + wage*OVERTIME_MULT*overtimeHours;
        System.out.println("Total Pay: " + totalPay);
    }
}
