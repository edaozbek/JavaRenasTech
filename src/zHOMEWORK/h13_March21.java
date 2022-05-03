package zHOMEWORK;

import sun.security.util.Length;

import java.util.Locale;
import java.util.Scanner;

public class h13_March21 {


    public static void main(String[] args) {

/*
        String sentence = "hello my name is hello worlD.   " +
                "i am 25 years old. i am living in new yorK .    " +
                "i have been in the IT industry for about 6 years.  " +
                "i starteD as a manUal tesTer and now doing AutOMation for about 4 years.  " +
                "i have experience in different DOmains: " +
                "education, Energy, finance.i have Scrum Master and Oracle Java Programmer certificates. " +
                "my main lanGuage is JAVA. i designed and deveLoped many automation test scripts " +
                "by using BDD framework";
        String s1 = "hello my name is hello worlD";
        String s2 = "i am 25 years old";
        String s3 = "i am living in new york";
        String s4 = "i have been in the IT industry for about 6 years";
        String s5 = "i starteD as a manual tester and now doing AutOmation for about 4 years";
        String s6 = "i have experince in different DOmains:education,Energy,finance";
        String s7 = "i have Scrum Master and Oracle Java Programmer certificates";
        String s8 = "my main lanGuage is Java";
        String s9 = "i designed and deveLoped many automation test scripts by using BDD framework";

        String St1=(s1.substring(0,1).toUpperCase().concat(s1.substring(1).replace("hello worlD", "Eda"))).trim();
        String St2=(s2.substring(0,2).toUpperCase().concat(s2.substring(2).toLowerCase()).replace("25", "42"));
        String St3=(s3.substring(0,1).toUpperCase().concat(s3.substring(1).toLowerCase()).replace("new york","Waterloo").trim());
        String St4=(s4.substring(0,1).toUpperCase().concat(s4.substring(1).toLowerCase()).replace("it","IT").trim());
        String St5=(s5.substring(0,1).toUpperCase().concat(s5.substring(1).toLowerCase()).trim());
        String St6=(s6.substring(0,1).toUpperCase().concat(s6.substring(1).toLowerCase()).trim());
        String St7=(s7.substring(0,1).toUpperCase().concat(s7.substring(1).toLowerCase()).trim());
        String St8=(s8.substring(0,1).toUpperCase().concat(s8.substring(1).toLowerCase()).replace("java", "Java").trim());
        String St9=(s9.substring(0,2).toUpperCase().concat(s9.substring(2).toLowerCase()).replace("bdd", "BDD").trim());


        System.out.println(St1);
        System.out.println("     *This sentence has "+ St1.length()+ " characters with an index of: "+(St1.length()-1));
        System.out.println("     **First letter of this sentence is: "+St1.charAt(0)+" and sixth character of this sentence is "+ St1.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St2);
        System.out.println("     *This sentence has "+ St2.length()+ " characters with an index of: "+(St2.length()-1));
        System.out.println("     **First letter of this sentence is: "+St2.charAt(0)+" and sixth character of this sentence is "+ St2.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St3);
        System.out.println("     *This sentence has "+ St3.length()+ " characters with an index of: "+(St3.length()-1));
        System.out.println("     **First letter of this sentence is: "+St3.charAt(0)+" and sixth character of this sentence is "+ St3.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St4);
        System.out.println("     *This sentence has "+ St4.length()+ " characters with an index of: "+(St4.length()-1));
        System.out.println("     **First letter of this sentence is: "+St4.charAt(0)+" and fifth character of this sentence is "+ St4.charAt(5)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St5);
        System.out.println("     *This sentence has "+ St5.length()+ " characters with an index of: "+(St5.length()-1));
        System.out.println("     **First letter of this sentence is: "+St5.charAt(0)+" and sixth character of this sentence is "+ St5.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St6);
        System.out.println("     *This sentence has "+ St6.length()+ " characters with an index of: "+(St6.length()-1));
        System.out.println("     **First letter of this sentence is: "+St6.charAt(0)+" and fifth character of this sentence is "+ St6.charAt(5)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St7);
        System.out.println("     *This sentence has "+ St7.length()+ " characters with an index of: "+(St7.length()-1));
        System.out.println("     **First letter of this sentence is: "+St7.charAt(0)+" and fifth character of this sentence is "+ St7.charAt(5)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St8);
        System.out.println("     *This sentence has "+ St8.length()+ " characters with an index of: "+(St8.length()-1));
        System.out.println("     **First letter of this sentence is: "+St8.charAt(0)+" and sixth character of this sentence is "+ St8.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));

        System.out.println(St9);
        System.out.println("     *This sentence has "+ St9.length()+ " characters with an index of: "+(St9.length()-1));
        System.out.println("     **First letter of this sentence is: "+St9.charAt(0)+" and sixth character of this sentence is "+ St9.charAt(6)+" and last character of this sentence is "+St1.charAt(St1.length()-1));
    }

    Create a java program that will check given string and
//  if string starts or ends with 'a' or 'A' remove it from string.
//  if it is not leave it as it is :
//  examples :
//  if string is Hello output should be Hello
//  if string is JavA output should be jav
//  if string is Ajavaa output should be jav

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String Word = scan.nextLine();

        if(Word.substring(0,1).equalsIgnoreCase("A")){
            Word = Word.substring(1);
        }
        int length = Word.length();
        int index = length-1;
        if(Word.substring(index).equalsIgnoreCase("A")){
            Word = Word.substring(0,index);
        }
        System.out.println("Your corrected word is: "+Word);


String word="hello";
char reverse;
for(int i=word.length()-1; i>=0; i--){
    reverse=word.charAt(i);
    System.out.print(reverse);

for (int r=1; r<=10; r++){
    System.out.print(r);
        }
int sum=0;
for (int r=1; r<=10; r++){
    sum +=r;}
    System.out.print(sum);

        Scanner input = new Scanner(System.in);
        System.out.println("Pleases enter a positive number: ");
        int x= input.nextInt();
        x=Math.abs(x);

        if (x>0 && x>0){
            for (int i=0; i<=x; i++)
                System.out.println(x+" X " +i+ " = "+i*x);
        }
            else{
                System.out.println("Invalid entry, please try with a positive number!");*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");
        int value = scanner.nextInt();
        int factorial = 1;
        for (int i=1; i<=value;i++){
            factorial = factorial*=i;
        }
        System.out.println("Factorial of the number you entered is: "+factorial);
    }}