package day19_methods;

public class c2_Methods {

    public static void main(String[] args) {

    //we call printJava10 in order to print java 10 times
    printJava10();
    hello();
    evenNumbers100();
}


       //declaration of the method
    // public               static           void               main        (String [] args){
    // Access-modifier       specifier        return-type        methodName  (parameter)
    //statements ,code
    //}

    //Access-Modifier =public, protected ,default ,private
    //specifier   : static ,final ,abstract ,synchronized
    //return type : void , any datatype(int,string,char , int [] .......)
    //some method has parameters some don't have parameter

    //create a method that will print java 10 times
    public static void printJava10(){
        for (int i=1 ; i <=10 ; i++){
            System.out.println("Java");
        }

    }

    //print a hello
    public static void hello(){
        System.out.println("Hello Hello");
    }

    ////create a method that will print even numbers between 1-100
    //    //name this method evenNumbers100

    private static void evenNumbers100() {
        for (int i = 2; i < 101; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
    }}

//    // void method (without parameters)
//    // void method (with parameters)\
//    // return method (without parameters)
//    // return method (with parameters)

//you can use above methods with different access modifier and specifier