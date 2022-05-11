package zHOMEWORK;

import java.util.Arrays;

public class h22_April7 {
    public static void main(String[] args) {
    /*    String alph= "AAABBBCCCDEF";
        String unique = "";
        for (int i = 0; i < alph.length(); i++) {
            int count = 0;
            for (int j = 0; j < alph.length(); j++) {
                if(i!=j&&alph.charAt(i)==alph.charAt(j)){
                    count++;
                }}
            if(count<1){
                unique += alph.charAt(i) + " ";
            }}
        System.out.println(unique);

        String a="abc";
        String b="cab";

        char c1[]=a.toCharArray();
        char c2[]=b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        System.out.println(Arrays.equals(c1,c2));

        ////    same("abc",  "abb");

        String w1="abc";
        String w2="abb";

        char []q1=w1.toCharArray();
        char[] q2=w2.toCharArray();

        Arrays.sort(q1);
        Arrays.sort(q2);

        System.out.println(Arrays.equals(q1,q2));*/

        int[][] list2 = {{38, -90, 0}, {5, 800, 4}};
        int max = list2[0][1];

        for (int i = 0; i < list2[0].length - 1; i++) {
            for (int j = 0; j < list2[1].length - 1; j++) {
                if (max < list2[i][j]) {
                    max = list2[i][j];
                }
            }
        }
        System.out.println("The maximum # is: " + max);



    }


}
