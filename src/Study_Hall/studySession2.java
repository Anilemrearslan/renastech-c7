package Study_Hall;

public class studySession2 {

    public static void main(String[] args) {

        //Logical Operators
        // & and operator
        boolean check1= true && true; // true
        boolean check2= false && false;//false
        boolean check3= true && false;// false //in and operator false always wins
        System.out.println(check1);
        System.out.println(check2);
        System.out.println(check3);

        boolean check4 = true && true && true && false;
                        //true && true && false;
                        // true && false;
                        // false;


        // | or operator

        boolean check5= true || true;//true
        boolean check6= false || false;//false
        boolean check7= true || false;// true // in or operator true always win
        boolean check8= false|| false || true || true; // true
        System.out.println(check5);
        System.out.println(check6);
        System.out.println(check7);
        System.out.println(check8);

        // Assignment operators

        String myString= " Class";
        myString= myString+ "- 7";
        System.out.println("myString = " + myString);

        int myInt= 10;
         myInt= myInt + 3; //13

        myInt= 15;
        System.out.println(myInt);

        int myInt2 = 15;
        //myInt2=20;
        System.out.println(myInt2 = 20);






    }
}
