package day06_IfElseStatements;

public class topic4_MultipleTurnery {

    public static void main(String[] args) {
        /*
        (condition)?first:(another condition)?:second:(condition)?third:forth;
         */
        //write a code where it checks if number is even odd or zero


        int number=71;
        String result;

        result=(number==0)?"number is zero":(number%2!=0)?"number is odd":"number is even";

        System.out.println(result);








    }
}
