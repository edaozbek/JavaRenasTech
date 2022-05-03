package zHOMEWORK;

import java.util.Scanner;

public class h8_March11_billions {
    /*
    task 1: create a java program that will check if number is divisible by 2 and 5 same time
    task 2: write java program to find the largest among three numbers. 1) Using if-else..if
    task 3: create Program to check whether the given number is positive or negative
      → If a number is greater than zero then it is a positive number
      → If a number is less than zero then it is a negative number
      → If a number is equal to zero then it is neither negative nor positive.


/* Task 1
    public static void main (String[] args){

        int N = 50;

        if (N % 2 == 0 && N % 5 == 0){

        System.out.println(N + " is divisible by 2 and 5");
    }
        else {
        System.out.println(N + " is not divisible by 2 and 5 at the same time");
    }

        int N1 = 75;

        if (N1 % 2 == 0 && N1 % 5 == 0){

            System.out.println(N1 + " is divisible by 2 and 5");
        }
        else {
            System.out.println(N1 +" is not divisible by 2 and 5 at the same time");
        }
}int x=25;
int y=80;
int z=120;

if (x>y  && x>z){
    System.out.println(x + " is the largest number ");
}else if(y>x && y>z ){
    System.out.println(y + " is the largest number");
}else {
    System.out.println(z + " is the largest number");
}*/

   /* Task 2
   public static void main (String[] args){
    int a=3;
    int b=6;
    int c=12;
if (a>b  && a>c){
        System.out.println(a + " is the largest number ");
    }else if(b>a && b>c ){
        System.out.println(b + " is the largest number");
    }else {
        System.out.println(c + " is the largest number");
    }}}*/

   /* task 3
public static void main(String[] args ){
    int number = 1;
    int number1 = 0;
    int number2 = -1;

         if(number>0){
        System.out.println( number + " is positive number");    }
            else if(number<0){
        System.out.println(number + " is negative number");    }
                else if (number == 0){
        System.out.println(number + " is neither negative nor positive number");}

            if(number1>0){
        System.out.println( number + " is positive number");    }
            else if(number1<0){
        System.out.println(number1 + " is negative number");    }
                else if (number1 == 0){
        System.out.println(number1 + " is neither negative nor positive number"); }

                if(number2>0){
                    System.out.println( number2 + " is positive number");                }
                else if(number2<0){
                    System.out.println(number2 + " is negative number");                }
                else if (number2 == 0){
                    System.out.println(number2 + " is neither negative nor positive number"); }}}
    */
/* Question 3
Discount and Revenue
Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
Write a program that asks the user to enter product price and quantity and then calculate the revenue.
If the revenue is more than 5000 a discount is 10% offered.
Program should display the discount and net revenue.

  public static void main(String[] args){
    double price=499.99;
    double quantity=11;
    double revenue= (price * quantity);
 System.out.println("Net revenue of the products sold is " +"$"+revenue );
 if (revenue>5000){
        double discount = revenue * 0.10;
        System.out.println("%10 discount offered and total discount amount is " +"$"+discount);
        double netRevenue= revenue-discount;
        System.out.println("Total price is " + "$"+netRevenue );
    }else if ( revenue<5000){
        System.out.println("The discount is not offered " + revenue);
    }}*/
/* Question 1
    Write a Java program that takes 4 numbers as input to calculate and print the average of the numbers.
public static void main(String[] args){
 double n1=12.43;
 double n2=23.12;
 double n3=1.32;
 double n4=92.78;
 double average=(n1+n2+n3+n4)/4;
    System.out.println(average);
 }

}*/

/* Question 16
Write a Java program to print a face. Go to the editor

Expected Output
 +""""""""+
  [| o o |]
  |   ^   |
  |  '-'  |
   +-----+
    public static void main(String[]args) {
        System.out.println("+\"\"\"\"\"\"\"\"\"\"\"+");
        System.out.println("[|  o   o  |]");
        System.out.println(" |    ^    |");
        System.out.println(" |   '-'   |");
        System.out.println(" +---------+");

    }}*/

/* Question 1
Even or Odd
Write a program that asks the user to enter a number and displays whether entered number
is an odd number or even number.

public static void main(String[] args){
    int number=124;
    String results="";
    if (number%2==0){
        results= number+" is an even number";
    }else{
        results= number+ " is an odd number";
    }
    System.out.println(results);
}}*/

/* Question 2
Absolute value
Write a program that asks the user to enter a number and displays the absolute value of that number.
"Absolute value" means to remove any negative sign in front of a number, all numbers as positive (or zero).

public static void main(String[]args){
    int absolute;
    System.out.println("Please enter a number below to find it's absolute:" );
    absolute = new Scanner(System.in).nextInt();
    System.out.println("Absolute value of the entered number is " + Math.abs(absolute));
}}*/
  /*  Question 4
Largest Number
Write a program that asks the user to enter a numbers in three variables and then displays the largest number.

    public static void main(String[] args){
        int n=213;
        int n1=6567;
        int n2=23426;
        int max=0;
        if(n>n1&&n>n2){
            max=n;
        }else if (n1>n&&n1>n2){
            max=n1;
        }else if(n2>n1&&n2>n){
            max=n2;
        }

        System.out.println("maximum number is " +max);}}*/
/* Question 5
Positive, negative or zero
Write a program that prompts the user to input a number.
The program should then output the number and a message saying whether
The number is positive, negative, or zero.

public static void main(String[] args){
    System.out.println("Enter a number");
Scanner n=new Scanner(System.in);

int number=n.nextInt();
if (number==0) {

    System.out.println("The number you entered equals to 0 (Zero)");
} else if (number<0) {
    System.out.println("The number you entered is a negative number");
}else if (number>0){
    System.out.println("The number you entered is a positive number");
 }}}*/
  /* Question 6
   Valid Triangle
   //A triangle is valid if the sum of all the three angles is equal to 180 degrees.
// Write a program that asks the user to enter three integers as angles and
// check whether a triangle is valid or not.

    public static void main(String[] args){


        int number=180;
int n1=100;
int n2=40;
int n3=40;

if (n1+n2+n3==180) {
    System.out.println("This is a valid Triangle");
}else if (n1+n2+n3<180){
            System.out.println("This is not a valid Triangle");
        }else if (n1+n2+n3>180){
    System.out.println("This is not a valid Triangle");
        }}*/

    /*Question 8
Telephone Bill
Write a program to calculate the monthly telephone bills as per the following rule:
Minimum Rs. 200 for up to 100 calls.
Plus Rs. 0.60 per call for next 50 calls.
Plus Rs. 0.50 per call for next 50 calls.
Plus Rs. 0.40 per call for any call beyond 200 calls.

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the amount of the calls made by this phone number? ");
        int call= input.nextInt();
        double Bill1;
        double Bill2;
        double Bill3;
        boolean Bill4;
        Bill1=200;
        Bill2=200+((call-100)*0.60);
        Bill3=200+(50*0.6)+((call-150)*0.5);


        if  (call <= 100 ){
            System.out.println("Your telephone bills for this month is Rs "+Bill1);
        }else if(call>100 && call<=150){
            System.out.println("Your telephone bills for this month is Rs "+Bill2);
        }else if (call>150 && call<=200){
            System.out.println("Your telephone bills for this month is Rs "+Bill3);
        }else if (call>200) {

        }

    Question 9
//Grade Calculator
//The marks obtained by a student in 3 different subjects are input by the user.
// Your program should calculate the average of subjects. The student gets a grade as per the following rules:
//Average
//Grade
//
//90-100 A
//80-89  B
//70-79  C
//60-69  D
//0-59  F}

    public static void main(String[] args){
        double g1=44;
        double g2=54;
        double g3=49;
        double average=((g1+g2+g3)/3);

        System.out.println(average);

        if (average<=100 && average >=90){
            System.out.println("Your Average Grade is A");
        }else if (average<=89 && average>=80){
            System.out.println(("Your Average Grade is B"));
        }else if (average<=79 && average>=70){
        System.out.println(("Your Average Grade is C"));
        }else if (average<=69 && average>=60){
            System.out.println(("Your Average Grade is D"));
        }else if (average<=59 && average>=0) {
            System.out.println(("Your Average Grade is F - You failed!!!"));
        }}
   Question 10 Meaning of Grade
        Write a program that prompts the user to enter grade.
        Your program should display the corresponding meaning of grade as per the following table

Grade  Meaning
A    Excellent

B    Good

C    Average

D    Deficient

F    Failing*/

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter your grade: ");

        char grade = console.next().charAt(0);

                switch (grade){
            case 'A':
        System.out.println("Excellent");
            break;
                    case 'a':
                        System.out.println("Excellent");
                        break;
        case 'B':
        System.out.println("Good");
            break;
                    case 'b':
                        System.out.println("Good");
                        break;
        case 'C':
        System.out.println("Average");
            break;
                    case 'c':
                        System.out.println("Average");
                        break;
        case 'D':
        System.out.println("Deficient");
            break;
                    case 'd':
                        System.out.println("Deficient");
                        break;
        case 'F':
        System.out.println("Failing");
            break;
                    case 'f':
                        System.out.println("Failing");
                        break;
        }
    }
 }