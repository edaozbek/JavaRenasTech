package day18_ForEachLoop;


public class c3_ForEachLoop {

    public static void main  (String[] args) {

        String[] Initials = {"GT", "LA", "O", "HK", "EG", "ACP", "G"};

        System.out.println("Initials: ");

      for (String letter: Initials){

          System.out.print(letter + " ");
      }

      System.out.println("*************");

String sentence="Hello world Java is here";

      String [] words=sentence.split( " ");
      for (String word : words){

          System.out.println(word);
      }


    }
}
