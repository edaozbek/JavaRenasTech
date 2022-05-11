package zHOMEWORK;

import java.util.Arrays;
import java.util.Scanner;

public class h19_April4 {
    public static void main(String[]args) {


       /* int[] numArray = {1,2,3,4,5,6,7,8,9,0,11,12,13,14};
          System.out.println("10th element of the array is: " +numArray[10]);
numArray[5]=35;
numArray[9]=numArray[6]+numArray[13];
        System.out.println("5th element is: " +numArray[5]);
        System.out.println("sum of 6th and 13th are: "+numArray[6]+numArray[9]);

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" , "Saturday"};
        for (String day : days) {
            System.out.println(day);
        }
   int SIZE = 10;
   int[] numbers = new int[SIZE];

        Scanner console = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers.");
        for (int i = 0; i < SIZE; i++){
            numbers[i] = console.nextInt();
        } int sum = 0;
        for (int i = 0; i < SIZE; i++)
        {sum += numbers[i];}
        System.out.println("Sum of numbers: " + sum);
        int SIZE = 5;
        int[] list1 = new int[SIZE];
        int[] list2 = new int[SIZE];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers.");
        for (int i = 0; i < SIZE; i++)
        {list1[i] = console.nextInt();
        }
        for (int i = 0; i < SIZE; i++)
        {
            list2[i] = list1[i];
        }
        System.out.println("Elements of list2 are: ");
        for (int i = 0; i < SIZE; i++){
            System.out.println(list2[i]);
        }
        Integer[] intArray = {1,2,3,4,5,6,7,8,9};

            System.out.println("Array:");
        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");
        System.out.println();
        System.out.println("Reversed Array:");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6]; //declaring array
        System.out.print("Enter 6 numbers: ");
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("The numbers you entered are: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        int min=arr[0],max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("\nMaximum is : "+max);
        System.out.println("Minimum is : "+min);
        int SIZE = 5;
        double[] salaries = new double[SIZE];
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the salaries of " + SIZE+ " employees.");
        for (int i = 0; i < SIZE; i++)
        {salaries[i] = console.nextDouble();}
        System.out.println("The salaries are:");
        for (int i = 0; i < SIZE; i++){
            System.out.println(salaries[i]);}

        int[] numbers = new int[]{20, 25, 15};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of '20, 25, 15' is: " + average);


        for (int i = 0; i < numbers.length; i++) numbers[i] = i;
        for (int e : numbers) sum += e;
        System.out.println("The sum of '20+25+15' is: "+sum);*/

        int[] numbers = new int[]{20, 25, 15};

        Arrays.sort(numbers);
        int length=numbers.length;
        int max=numbers[length-1];
        int min=numbers[0];

        System.out.println("Max: " +max+" Min: "+min);




    }
    }















