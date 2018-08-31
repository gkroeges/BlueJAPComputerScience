/*
 * inputs:
 *  last name(string)
 *  first name(string)
 *  class(int)
 *  phone#(string)
 * outputs:
 *  the same information back, but formatted well
 */

import java.util.Scanner;

public class Critical_Thinking
{
    public static void main(String [] args)
    {
        
        //initialize variables
        String lastName;
        String firstName;
        int grade;
        String phoneNum;
        Scanner reader = new Scanner(System.in);
        
        //prompt the user for the information
        System.out.println("Last Name (string): ");
        lastName = reader.nextLine();
        System.out.println("First Name (string): ");
        firstName = reader.nextLine();
        System.out.println("Phone Number (string): ");
        phoneNum = reader.nextLine();
        System.out.println("Grade (int): ");
        grade = reader.nextInt();
        
        //output the data back to the user
        System.out.println(lastName + ", " + firstName + " " + grade);
        System.out.println("Phone Number: " + phoneNum);
    }
}
