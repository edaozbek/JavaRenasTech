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




    }


}
