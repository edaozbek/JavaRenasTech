package zHOMEWORK;

public class h5_March7_Variables_Task3 {
    // check if 350 is divisible by 2 , 3 , 5 (Check for each number)
    // if it is divisible print : 350 is divisible by 2 true
    // if it is not divisible print : 350 is divisible by 2 false public static void main(String[] args) {
public static void main (String[] args){

        int n1 = 350;
        byte n2 = 2;
        byte n3 = 3;
        byte n4 = 5;

        boolean bo1 = 350 != n2; // true
        boolean bo2 = 350 == n3; // false
        boolean bo3 = 350 != n4; // true
        boolean bo4 = 50 == -7; // false

        System.out.println(n1 + "is divisible by 2 :" + bo1);
        System.out.println(n1 + "is divisible bye 3 :" + bo2);
        System.out.println(n1 + "is divisible bye 5 : " + bo3);
        System.out.println(n1 + "is divisible bye -7 : " + bo4);
    }}