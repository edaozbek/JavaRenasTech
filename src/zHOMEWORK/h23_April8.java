package zHOMEWORK;

import java.util.Arrays;
import java.util.Scanner;

public class h23_April8 {
    public static void main(String[] args) {

     /*   String [] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input = new Scanner(System.in);

        int attempt=1;
        int invalidNumber=1;

        do {System.out.println("Please enter a number 1 to 7");
            int number=input.nextInt();
            if(number>=1 && number<=7){System.out.println(days[number-1]); invalidNumber=1; attempt=1;}
            else {invalidNumber=number;
                System.out.println("The number you entered is invalid"); attempt++;}}

        while (invalidNumber<1 || invalidNumber>7 && (attempt!=1 && attempt<4));


String[] names = {"hello", "world", "java", "python", "sevgin", "renastechschool"};

        int max=names.length;
        String largestStr=" ";
        for (String str:names){
            if (str.length()>max){
                max=str.length();
                largestStr=str;
                        }
        }
        System.out.println("Largest String is: "+largestStr);

        String[] names1 = {"hello", "world", "java", "pyton", "JS", "sevgin", "renastechschool"};

        int min=names1.length;
        String shortestStr=" ";
        for (String str:names1){
            if (str.length()<min){
                min=str.length();
                shortestStr=str;
            }
        }
        System.out.println("Shortest String is: "+shortestStr);
String[] cityNames = new String[5];
Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 different city names below");
        for (int i=0; i<cityNames.length; i++){
            cityNames[i] = input.nextLine();
            }
        System.out.println("the city names you entered are: "+ Arrays.toString(cityNames));
        for (String newCityNames: cityNames){
            System.out.println(newCityNames.charAt(0)+""+newCityNames.charAt(Integer.parseInt(newCityNames.length()-1+"")));
        }*/

String word="JavAaaaa";
String [] split = word.split("");
int count = 0;
for (String letters : split){
    if (letters.equalsIgnoreCase("a")){
        count++;
    }
}
        System.out.println("The number of the letter A-a's in JavAaaaa is: "+count);

    }





}
