package zHOMEWORK;

import java.util.Arrays;

public class h21_April6 {

    public static void main(String[] args){


    /*int[] arr={20,30,40,54,65};

            System.out.println(Arrays.toString(arr));

        int [] SortN ={72,4870,-259,-223, 6};
        Arrays.sort(SortN);
        System.out.println(Arrays.toString(SortN));

        int [] numbers1 ={72,4870,-259,-223, 6};
        int [] numbers2={-72,4870,-259,-223, 6};

        boolean numbers3=Arrays.equals(numbers1,numbers2);
        System.out.println((numbers3));


        int[] arr={1,2,3,4,78};
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }*/
    String Sentence = "Java is fun";
    String reverseSentence="";

    String[]splitedSentence=Sentence.split(" ");
    System.out.println(Arrays.toString(splitedSentence));

    for (int i=splitedSentence.length-1;i>=0;i--){
    reverseSentence+=splitedSentence[i] + " ";
    }
    System.out.println(reverseSentence);


    String Sentence2="Java is fun";
    String reverseSentence2="";

    String[]splitedSentence2=Sentence2.split("");

    for (int i=splitedSentence2.length-1;i>=0;i--){
    reverseSentence2+=splitedSentence2[i];
    }
    System.out.println(reverseSentence2);




}}
