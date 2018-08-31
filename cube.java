/* asks the user to input a the length of a single
 * edge of a cube and then calculates surface area using
 * 
 *      SA = edge^2 * 6
 *      
 *      inputs:
 *          length of edge
 *      outputs:
 *          surface area of cube
 */

import java.util.Scanner;

public class cube
{
    //variables 
    public static void main(String [] args)
    {
        //declare variables
        int lengthEdge;
        int surfaceArea;
        
        Scanner reader = new Scanner(System.in);
        
        //get user input
        System.out.print("Enter the length of the edge (an integer): ");
        lengthEdge = reader.nextInt();
        
        //calculate and output
        surfaceArea = lengthEdge * lengthEdge * 6;
        System.out.print("The surface area is " + surfaceArea);
    }
}
