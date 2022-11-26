package homework;

public class Homework_42 {
    /*
    Write a method where it takes a String and returns to a String by adding "Not" in front of the String
    only if It does not have "Not" in front of it already.
 For example :
 notString("Car" ) == > "Not Car"
 notString("Home"). ==> "Not Home"
 notString("Not Home") == > "Not Home"
     */

    public static void main(String[] args) {
        String word = "Not Home";
        String word2 = "Home";
        System.out.println(NotString(word));
        System.out.println(NotString(word2));
    }

    public static String NotString(String param1){

        String Check = param1.substring(0,3);

        if (Check.equals("Not")){
            return param1;
        }else {
            return "Not "+ param1;
        }

    }
}
