package zHOMEWORK;

public class h7_March10_2tasks {

////Task 1: only if
///*
//Create a string variable with today’s data Example: “March 2”;
//Create another varible with newrozDate and put value of the Newroz date “March 21";
//if todaysDate and newrozDate are equals print Happy Newroz.
//*/

  /*  public static void main(String[] args) {
        String today="April 13";
        String Newroz="March 21";

        if(today==Newroz) {

            System.out.println("Happy Newroz");

        }    }    }*/


//Task 2; if else

/*
John and Mike both play basketball in different teams. In the latest 3 games, John's team scored 89,
120 and 103 points, while Mike's team scored 116, 94, and 123 points.

1. Calculate the average score for each team.
2. Decide which team wins in average (highest average score), and print the winner to the console with if else statement.
Also include the average score in the output.
3. Then change the scores to show different winners.
Don't forget to take into acCount there might be a draw (the same average score).
*/

    public static void main(String[] args) {
        int JT1 = 89;
        int JT2 = 120;
        int JT3 = 103;

               int JT = (JT1+JT2+JT3) / 3;

        System.out.println("John's team has an average of " + JT);

        int MT1 = 116;
        int MT2 = 94;
        int MT3 = 123;

               int MT = (MT1+MT2+MT3) / 3;

        System.out.println("Mike's team has an average of " + MT);

        if (JT > MT) {
            System.out.println("John's team is thew winner with the highest average score of " + JT);
        } else {
            System.out.println("Mike's team is the winner with the highest average score of " + MT);
        }
        if (JT < MT) {
            System.out.println("John's team is the winner with the highest average score of " + JT);
        } else {
            System.out.println("Mike's team is the winner with the highest average score of " + MT);
        if (JT == MT) {
            System.out.println("CONGRATS TO BOTH TEAMS");

    }}}}