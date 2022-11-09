package day22_MethodOverLoadAndWrapperClass;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class WrapperClasses {

    public static void main(String[] args) {

        //primitive Data types
        // byte
        // int
        // short
        // long
        // float
        // double
        // boolean
        // char

        // Non-primitive Data types  objects are getting created by classes

        // Primitive classes

        // byte                   // Byte
        // int                    // Integer
        // short                  // Short
        // long                   // Long
        // float                  // Float
        // double                 // Double
        // boolean                // Boolean
        // char                   // Character


        int number = 5;

        System.out.println(number);

        Integer numbers =5;

        System.out.println(numbers);

        numbers.toString();

        System.out.println(numbers.toString());

        //Example

        // ArrayList<int> MyNumbers= new ArrayList<int>(); // invalid

        //ArrayList<Integer> MyNumbers= new ArrayList<Integer>(); //valid

        String name= ""; //non-primitive

        Character myChar = 'A';

        Byte b1 = 11; //Wrapper
        byte b2 = 12; //primitive
        Byte b3 = b2; // Wrapper

        line();

        //toString
        Integer myInt = 5;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());


        // Data Structure and Algorithm


    }
}
