package Study_Hall;

public class String_methods {

    public static void main(String[] args) {
        String String1="Hello";
        String String2="HELLO";

        float first3=1.0f;
        int first =1;
        System.out.println(first==first3);
        System.out.println("***************");

        //Equals
        System.out.println(String1.equals(String2));
        //EqualsignoreCase
        String String11 = "Hello";
        String String22 = "HELLO";
        System.out.println(String11.equalsIgnoreCase(String22));

        //charAt
        char firstlatter = String11.charAt(0);
        System.out.println("firstlatter = " + firstlatter);

        //isEmpty

        String myString= null;
        String myString2="";
        System.out.println(myString2.isEmpty());
    }
}
