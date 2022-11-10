package day22_MethodOverLoadAndWrapperClass;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Parsing {

    // parse method converts String of text to the primitives

    public static void main(String[] args) {

        String str = "1900";

        System.out.println(str+55);

        line();

        int number = Integer.parseInt(str);

        System.out.println(number+55);



    }
}
