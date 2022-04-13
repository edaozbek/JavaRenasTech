package day02_variables;

public class c6_aritmeticOperators {

//        float            4 bytes            Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double           8 bytes            Stores fractional numbers. Sufficient for storing 15 decimal digits

//        As a default java picks double for decimal number

public static void main(String[]args){

    double d1=5.5;
    System.out.println(d1);
    double d2=2.333333;
    System.out.println(d2);

    System.out.println(4.5); //any decimal number that is not defined with variable will be taking as a double

    float f1=2.5f; //java will take decimal numbers as a double that is why we need to tell compiler that it is a float number

    System.out.println(2+5); //this will calculate the result
    System.out.println("2+5"); //this is just a text, it will out as 2+5
// sum of 2 numbers in codes`
int i1=3;
int i2=5;
System.out.println(i1+i2);



    //sum of 2 numbers
    System.out.println(i1 + i2);//number + number = number 8
    System.out.println(i1 - i2);

    double doubled1=5.5;
    double doubled2=3.5;

    System.out.println(doubled1 + doubled2);//9.0

    //minus operator
    System.out.println(i2-i1);
    System.out.println(d1-d2);
}


}
