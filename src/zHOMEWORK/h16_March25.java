package zHOMEWORK;

import java.util.Scanner;

public class h_16_March25 {

    public static void main(String[] args) {

/*     String sentence="Java is fun, but sometimes java is just pain. Love java java java";
     int count=0;
         for (int i=0; i<sentence.length(); i++){
         if(sentence.substring(i,i+1).equalsIgnoreCase("a")){ count++;}}

             System.out.println("There are total of" +count+ "'a's in this sentence");
        int a=0;
        while (a<100){
            a++; if (a%3==0 && a%4==0){
                System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.println("Be ready for the magic!!! Enter a number or a word below and I will give you the reverse of it!!!");
        String list = input.nextLine();
        String reverseList = " ";

        int lastIndex = list.length() - 1;
        while (lastIndex >= 0) {
            reverseList += list.charAt(lastIndex);
            lastIndex--;
        }System.out.println("The magical number is: "+reverseList);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number:");
        int a=scan.nextInt();
        int reverse=0;
        while (a !=0){
            reverse=reverse*10+a%10;
            a=a/10;}
        System.out.println(reverse);
        }

    }


