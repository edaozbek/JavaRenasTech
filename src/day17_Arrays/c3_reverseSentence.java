package day17_Arrays;

public class c3_reverseSentence {
    public static void main (String[] args){


        String myString="Java is fun ";

        String input = "Java is fun";
        String strArray[]=input.split(" ");
        String output="";
        for (int i = strArray.length; i > 0 ; i--) {
            output =output+ " " +strArray[i-1];
        }
        System.out.println(output);

        String reverseSentence="";

        for (int i=myString.length()-1; i>=0; i--){

            reverseSentence+=myString.charAt(i);

        }



        System.out.println(reverseSentence);


        //////create a condition that will reverse given string
        //             //        //ex: Java is fun
        //             //output should be nuf si avaJ

        String sentence2="Java is fun";
        String [] split2=sentence2.split(""); // we will split from each letter abd store into string array

        String reverse2="";

        for (int i = split2.length-1 ; i >=0 ; i--){

            reverse2 += split2[i] ;
        }

        System.out.println(reverse2);
    }
}

