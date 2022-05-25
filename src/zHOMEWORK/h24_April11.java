package zHOMEWORK;

public class h24_April11 {
    /*public static void main(String[] args) {
        parameters(100, 200);

    }
public static void parameters (int a, int b){
    System.out.println(a+b);*
    public static void main(String[] args) {
        System.out.println("Count of the word \"java\" =" +wordCount("java"));
        System.out.println("Count of the word \"javascript\" =" + wordCount("Javascript"));
    }
        public static int wordCount (String word){
    String sentence = "I like java and javascript, java is best, java and javascript, java ";
    String replaceSentence=sentence.replace(",","");
    String stringArray[]=replaceSentence.split(" ");
        System.out.println(Arrays.toString(stringArray));
        int count=0;
        for(String str:stringArray){
            if (str.equalsIgnoreCase(word)){
                count++;
            }
        }
    return count;

    public static void main(String[] args) {
        uniqueValue(new String[]{"A", "A", "B", "C", "C" });
        uniqueValue(new String[]{"A", "B", "B", "C" });
    }
    public static void uniqueValue(String[]arrays){
        for (int i = 0; i <arrays.length ; i++) {
            int count=0;
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[i]==arrays[j]){count++;}}
            if (count==1){
                System.out.println("the unique:  "+ arrays[i]);
            }
        }
    public static void main(String[] args) {

        System.out.println(palindrome("ali"));
        System.out.println(palindrome("mom"));
        System.out.println(palindrome("hello"));
    }
public static boolean palindrome(String name){

        StringBuilder answer=new StringBuilder();
        boolean a;
        for (int i=name.length()-1; i>=0; i--){
        answer.append((name.charAt(i)));}
        a=name.equalsIgnoreCase((answer.toString()));
        return a;
    public static void main(String[] args) {
        sleepIn(false, false);
        sleepIn(true, false);
        sleepIn(false, true);
    }

    public static boolean sleepIn(boolean weekday,boolean vacation) {
        boolean result = true;
        if (weekday != true || vacation == true) {
            result = true;
           } else{
            result = false;}

            System.out.println(result);

        return result;
    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));}

    public static int sumDouble(int a, int b){
        int result=0;
                if(a!=b){
                    result=(a+b);
                }else if (a==b){
                    result=(a+b)*2;
                }return result;*/

    public static void main(String[] args) {
        absoluteDifference(19);
        absoluteDifference(10);
        absoluteDifference(21);
        absoluteDifference(24);
    }
        public static void absoluteDifference(int n) {
            int result = 0;
            if (n == 21) {
                result = 0;
            } else if (n > 21) {
                result = (21 - n) ;
            } else if (n < 21) {
                result = 21 - n;
            } else {
                System.out.println("Error");
            }
            System.out.println("the differece between 21 minus " + n +
                    " is " + result);


        }}