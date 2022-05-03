package zHOMEWORK;

public class h11_March16 {


     /* == checks if both objects point to the same memory location whereas
    equals(=) evaluates to the comparison of values in the objects*/

    //Exercise 1: Show two ways to concatenate the following two strings together to get the string "Hi, mom.":
    // String hi = "Hi, ";
    // String mom = "mom.";
/*
    public static void main(String[]args){
    String S1="Hi, ";
    String S2="Mom";
 System.out.println(S1.concat(S2));*/

    /* Write a Java program to compare a given string to another string, ignoring case considerations.
Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false
"Stephen Edwin King" equals "stephen edwin king"? true*/
  /*  public static void main(String [] args){
        String SEK = "Stephen Edwin King";
        String WM = "Walter Winchell";
        String sek = "stephen edwin king";

        System.out.println(SEK.equalsIgnoreCase(WM));
        System.out.println(SEK.equalsIgnoreCase(sek));

    }}
    public static void main(String [] args) {
        String message1 = "Python Exercises";
        String message2 = "Python Exercise";

        System.out.println(message1.endsWith("se"));
        System.out.println(message2.endsWith("se"));
    }}

    Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output:
Original String: PHP Exercises and Python Exercises
Specified sequence of char values: and
true
    public static void main(String [] args){

    String Sentence = "PHP Exercises and Python Exercises";


        System.out.println(Sentence.contains("PH"));
        System.out.println(Sentence.contains("Ex"));
        System.out.println(Sentence.contains("and"));
        System.out.println(Sentence.contains("Py"));
        System.out.println(Sentence.contains("cis"));
    }
}
    Write a Java program to compare two strings equlty. Two strings are equal if they are the same length and contain the same characters in the same positions.
        Sample Output:
        String 1: This is Exercise 1
        String 2: This is Exercise 2
        "This is Exercise 1" not equal "This is Exercise 2"
    public static void main(String[] args) {
        String S1 = "This is Exercise 1";
        String S2 = "Exercise 2";

        System.out.println(S1.equals(S2));
        System.out.println(S1 + " and it is not equal to " + S2);
    }

    Write a Java program to get the character at the given index within the String.
        Sample Output:
        Original String = Java Exercises!
        The character at position 0 is J
        The character at position 10 is i*/
public static void main(String[]args) {
    String OriginalString = "Java Exercises!";
    System.out.println(" The character at position 0 is: " + OriginalString.charAt(0));
    System.out.println(" The character at position 10 is: " + OriginalString.charAt(10));
}}


