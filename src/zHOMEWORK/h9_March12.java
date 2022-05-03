package zHOMEWORK;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class h9_March12 {
    /*Mahir:
    Tip Calculator  [if-else]

Jane wants to build a very simple tip calculator for whenever he goes eating in a restaurant.
In his country, it's usual to tip 15% if the bill value is between 99 and 280.
If the value is different, the tip is 20%.
Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
Example: "The bill was 275, the tip was 41.25, and the total value 316.25
Data to test 97 ,100, 275 , 25


    public static void main (String [] args){
        Scanner Console = new Scanner(System.in);
        System.out.println("Please enter your bill amount ($); ");

        double BillAmount = Console.nextInt();
        if (BillAmount<=280 && BillAmount>=99) {
            System.out.println("When the bill amount is $" + BillAmount + ", the tip amount is $" + ((BillAmount*15)/100) + "the total amount paid is $" + (BillAmount + ((BillAmount * 15) / 100)));

        }else if (BillAmount<=98){
                System.out.println("When the bill amount is $" +BillAmount+ ", the tip amount is $"+ ((BillAmount*20)/100)+ "the total amount paid is $" +(BillAmount+((BillAmount*20)/100)));
        }else if (BillAmount>=281){
            System.out.println("When the bill amount is $" +BillAmount+ ", the tip amount is $"+ ((BillAmount*20)/100)+ "the total amount paid is $" +(BillAmount+((BillAmount*20)/100)));
            }
/Coding Alexa for Weather [multiple Conditions]

New graduate Renastech students want to improve Alexa, and they will add weather functionality;
Please help students with the assignment below.
-Ask the user what's temperature as Fahrenheit;

-Convert the value to Celsius formula :  C = F-32 / 1.80

if temperature is  -10 or below  ==> print it's too cold
if temperature is between -10 and 0 ==> print  it's cold
if temperature is between 0 and 15 ==> print it's not cold
if temperature is between 15 and 40 ==>print it's warm
if temperature is 40 and 60 ===> print it's extremely hot!!
if temperature is above 60 ==> print hot as hell

Data to test: -40 F , 5F , 50f, 82, 130F, 400F

    }
    public static void main(String[] args){
    Scanner weather=new Scanner(System.in);
        System.out.println("Enter the Weather in F");
    double f= weather.nextDouble();
    String theweather;
    double C=(f-32)/1.8;
        System.out.println(C + "C");
        if (C<=-10){
        System.out.println("It's too cold");
    }
        else if(C>-10 && C<=0 ) {
        System.out.println("It's cold");
    }
        else if(C>0 && C<=15){
        System.out.println("It's not cold");
    }
        else if(C>15 && C<=40){
        System.out.println("It's warm");
    }
        else if(C>40 && C<=60){
        System.out.println("It's extremely hot!");}
    }
    }

1- Ask the user's year of birth and create the user's age as variable
        2- Create a new int variable name it as myLuckyNumber and assign any number you want
        3-Ask user to enter his/her lucky number(new int variable with any value you would like to add)

        4- if the User is 18 years old or older, and the user's luckyNumber and your lucky number is matching Print "Congrats you won 1 milyon$$$$$$$ "
        5- if the user is younger than 18 don't ask the user's lucky number and print "You can not join lottery because of your age , Sorry"
        6- if the user is 18 years old or older, and the user's lucky number and your lucky number are not matching Print "Please try again"
*/

    public static void main(String[] args){

      Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter the year you were born in: ");

        int YearOfBirth = Scan.nextInt();
        int CurrentYear = 2022;
        int UserAge = CurrentYear-YearOfBirth;
        int MyLuckyNumber = 8;
        System.out.println("Please enter your lucky number: ");
        int LuckyNumber = Scan.nextInt();

        if (UserAge >= 18 && (LuckyNumber==MyLuckyNumber)){
            System.out.println("Congratulations!!! YOu are the Winner!!! $1.000.000");
        }else if (UserAge<18){
            System.out.println("Only 18 and above can play this game! Please try when you are 18");
        }
    }
}

   /* A Java string is a sequence of characters that exist as an object of the class java. lang.
   Java strings are created and manipulated through the string class.
   Once created, a string is immutable -- its value cannot be changed.
   There are two ways to create a String object:
   By string literal : Java String literal is created by using double quotes.
   By new keyword : Java String is created by using a keyword “new”.
   It is immutable because of the security, synchronization and concurrency, caching, and class loading.
   String pool is a storage area in Java heap where string literals stores.

   == checks if both objects point to the same memory location whereas
   equals(=) evaluates to the comparison of values in the objects
    */