package day20_ReturnMethods;

import java.util.Scanner;

public class c6_Calculator {

    public static void main(String[] args) {
        calculator(5,8, '*');


    }
        Scanner scan = new Scanner(System.in);


        public static int calculator(int a, int b, char c){
            String result=" ";
            switch (c) {
                case '+':
                    result += a + b;
                    break;
                case '-':
                    result += a - b;
                    break;
                case '*':
                    result += a * b;
                    break;
                case '/':
                    result += a / b;
                    break;
                case '%':
                    result += a % b;
                    break;
                default:
                    result += "invalid";
                    break;
            }
            System.out.println(result);


            return a;
        }}

/// write a method that will take 3 parameters
//  // 2 numbers and one operator
//  // it will do the calculation
//
//  //ex : 200 100 +
//  //result 300
//
//  //ex 15 3 *
//  //result 45
//*