package zHOMEWORK;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.security.util.Length;

import java.util.Scanner;

public class h12_March17 {

    /* Ask the user to enter a number by using the scanner
If the number is divided by 5 and 3 print FinRa
If the number is divided by 3 print Fin
If the number is divided by 5 print RA


    public static void main(String [] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number1 = input.nextInt();
        if (number1 % 3 == 0 && number1 % 5 == 0) {
            System.out.println("FinRa");
        } else if (number1 % 3 == 0) {
            System.out.println("Fin");
        } else if (number1 % 5 == 0) {
            System.out.println("Ra");
        }
    }


    // Ask user to enter 3 names by using scanner
// print last index of the names with the names
// Example : Renastech --> Last index is h for Renastech

    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("You will be asked to enter 3 names, please enter the first name: ");
        String name1 = input.nextLine();
        System.out.println("Please enter the second name: ");
        String name2 = input.nextLine();
        System.out.println("Please enter the third name: ");
        String name3 = input.nextLine();

        System.out.println("Last letter of " + name1 + " is " + name1.charAt(name1.length() - 1));
        System.out.println("Last letter of " + name2 + " is " + name2.charAt(name2.length() - 1));
        System.out.println("Last letter of " + name3 + " is " + name3.charAt(name3.length() - 1));
    }

// Ask user to enter their first name , last name, and middle name
//And print user's initials
// If the user doesn't have a middle name user will enter N/A*/
    public static void main(String [] arg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String name = input.nextLine();
        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Please enter your middle name: (Please type \"N/A\" if you don't have a middle name");
        String middleName = input.nextLine();
        if (middleName.equals("N/A")|| middleName.equals("n/a")|| middleName.equals("na")|| middleName.equals("NA")){
        System.out.println("User's initials are: " + name.charAt(0)+lastName.charAt(0));}
        else {System.out.println("User's initials are: "+ name.charAt(0)+lastName.charAt(0)+middleName.charAt(0));

                }}}

