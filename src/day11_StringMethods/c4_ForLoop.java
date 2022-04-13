package day11_StringMethods;

public class c4_ForLoop {
    public static void main(String[] args) {
       //loops will help you on continuous actions
        //in the loop
        //you'll always need to specify
        //starting point
        //ending point
        //iteration

        for (int i=0 ; i<=10 ; i++) { //i = 0, i = 1, i = 2,....i = 10, i = 11
            //starting point = 0
            //ending point = 10
            //iteration = +1
            System.out.println("Java is fun");//will print for i=0, 1, 2, 3, ...9, 10

        }
        //starting point 0
        //ending point 7
        //iteration +2
        for (int i =0 ; i <8 ; i +=2) { //i=0 , i=2 , i=4 , i=6 , i=8

            System.out.println("hello"); //i=0, 2, 4, 6
        }

        for (int k=1 ; k <= 10 ; k +=3){  //k=1, k=4 , k=7 , k=10

            System.out.println("java"); // k=1, 4, 7, 10

        }
    }
}
