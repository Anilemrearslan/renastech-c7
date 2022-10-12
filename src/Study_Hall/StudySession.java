package Study_Hall;

import java.sql.SQLOutput;

public class StudySession {

    public static void main(String[] args) {
        String myString="renas";
        String mysecondString= "tech";
        String concat=mysecondString+mysecondString;
        System.out.println("concat = " + concat);
        System.out.println(myString+" "+mysecondString+"!");

        int num1= 3;
        float num2 =0.14f;
        System.out.println("the pi number is not "+num1 + num2);
        //"the pi number is 3"+ num2
        //the pi number is 30.14"
        System.out.println("the pi number is "+(num1 + num2));
        System.out.println(num1+num2+"this is pi number");


        // - subtraction

        byte num3=-127;
        byte num4=+5;
        System.out.println(num3-num4);


        // * multiplication

        int num5=2;
        int num6=2;
        int num7=2;

        System.out.println(num5*num6*num7*2);

        // /division

        int number =81;
        int number1=40;

        System.out.println("81/40 = "+(number/number1));

        float number2=81.0f;
        int number3=40;
        System.out.println("81/40 = "+number2/number3);


        // % reminder

        int number4 = 11;
        System.out.println("############");
        System.out.println(number4%4);







    }
}
