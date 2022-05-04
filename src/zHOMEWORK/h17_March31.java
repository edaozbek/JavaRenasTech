package zHOMEWORK;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class h_17_March31 {
    public static void main(String[] args) {
      /*Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number=scan.nextInt();
        System.out.println("The number you entered is: "+number);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n1= input.nextInt();
        System.out.println("Please enter another number:");
        int n2= input.nextInt();
        int sum=(n1+n2);
        System.out.println("The total of the numbers you entered are: "+sum);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number with a decimal:");
        float n1= input.nextFloat();
        System.out.println("Please enter another number:");
        float n2= input.nextFloat();
        float total=(n1*n2);
        System.out.println("The multiplication of the numbers you entered are: "+total);
        int asci='e';*/
        /*System.out.println("the ASCII value of 'e' is:"+asci);
       int Number=100;
       int DividedBy=7;

        System.out.println("Quotient of "+Number+" divided by "+DividedBy+" is "+(Number/DividedBy));
        System.out.println("Remainder of "+Number+" divided by "+DividedBy+" is "+(Number%DividedBy)); */
/*int firstNumber22   =22;
int secondNumber66  =66;
int swap;

swap            =   firstNumber22;
firstNumber22   =   secondNumber66;
secondNumber66  =   swap;

        System.out.println("First number is: "+firstNumber22);
        System.out.println("Second number is: "+secondNumber66);*/
/*int n=654;
if(n%2==0){
    System.out.println("This is an even number");
}else{
    System.out.println("This is an odd number");*/
   /*     Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter from the alphabet");
        char letter = scan.next().charAt(0);
        if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
                letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
            System.out.println("The letter you entered is a vowel");
        } else {
            System.out.println("The letter you entered is a consonant");}*/
       /* double n1 = -2.225, n2 = 1.912, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");*/

/*        int year = 2878;
        if (year % 4 == 0 && year%100!=0 ||year%400==0) {
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        int num=6465;
        if(num>0){
            System.out.println("The number is positive.");
        }else if(num<0){
            System.out.println("The number is negative.");
        }else{
            System.out.println("The number is zero.");
        char w = '*';

        if( (w >= 'a' && w <= 'z') || (w >= 'A' && w <= 'Z'))
            System.out.println(w + " is an alphabet.");
        else
            System.out.println(w + " is not an alphabet.");*/

/*
        int i, num = 10, sum = 0;
        for(i = 1; i <= num; ++i){
            sum = sum + i;}
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }*/
/*
        int i,fact=1;
        int number=9;//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);*/
  /*      Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number to see it's multiplication table");
        int num = scan.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+(num*i));}*/
   /*     int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);
        for(i=2;i<count;++i) {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

        char c;

        for(c = 'A'; c <= 'Z'; ++c)
            System.out.print(c + " ");*/
/*
        int count = 0, num = 1988702;
        while (num != 0) {
            num /= 10; ++count;
        }
        System.out.println("Number of digits: " + count);
*//*
        int num = 546346, reversed = 0;

        System.out.println("Number: " + num);
           while(num != 0) {
               int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);*/
/*
        int base = 2, exponent = 3;
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }

        System.out.println("The answer is " + result);*/
      /*  String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word or number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("The word or number you entered is a palindrome.");
        else
            System.out.println("The word or number you entered isn't a palindrome.");*/

      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        int temp;
        boolean Prime=true;
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {   temp=num%i;
            if(temp==0)
            { Prime=false;
                break;
            }
        }
        if(Prime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");*/
/*
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int n1= input.nextInt();
        System.out.println("Please enter another number:");
        int n2= input.nextInt();
        while (n1 < n2) {  boolean b1= false;
            for(int i = 2; i <= n1/2; ++i) {
                if(n1 % i == 0) {
                    b1= true;
                    break;
                }
            }            if (!b1 && n1 != 0 && n1 != 1)
                System.out.print(n1 + " ");
            ++n1;
        }*/

/*

        int number = 42, originalNumber, remainder, result = 0;
        originalNumber = number;
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");*/
     /*   char operator;
        Double number1, number2, result;

             Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        number1 = input.nextDouble();
        System.out.println("Please enter another number");
        number2 = input.nextDouble();
        System.out.println("Please choose an operator for your calculation: +, -, *, or /");
        operator = input.next().charAt(0);

        switch (operator) {

            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();*/
/*        String TriangleStar = "*";
for (int i=0; i<=7; i++)*/










    }}