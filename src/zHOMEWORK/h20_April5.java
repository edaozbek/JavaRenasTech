package zHOMEWORK;

import java.util.Arrays;
import java.util.Scanner;

public class h20_April5 {

    public static void main(String []args){

   //   int[] numbers = new int[]{23, 25, 26, 32, 42, 51, 99, 2};
  //  System.out.println("From the given numbers, only these 3 are divisible by 3: ");
	//	for (int i=0; i< numbers.length; i++) {
      //  if (numbers[i]%3==0)
        //    System.out.println(numbers[i]);}
  /*      int[] arr={2,3,5,6,56,0,53};
        int sum=0;
        for (int i =0; i<arr.length; i++){
            if (arr[i]%2!=0) {
                sum += arr[i];
            }        }
        System.out.println("Sum of ODD numbers is: "+sum);*/
   /*     int[] arr={2,90,4,-99,99,73};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int[] biggestToSmallest = new int[arr.length];
        int temp = 0;
        for(int i=arr.length-1; i>=0; i--)
        {biggestToSmallest[temp]=arr[i]; temp++;}

            System.out.println(Arrays.toString(biggestToSmallest));*/

        String [] name={"java","name1","name2","JaVa","JaVA","C","R" ,"Java"};
        int count=0;
        for (int i = 0; i < name.length; i++) {
            if(name[i].equalsIgnoreCase("java")){
                count+=1;
            }
        }
        System.out.println("print java count: "+ count );


    }


    }

