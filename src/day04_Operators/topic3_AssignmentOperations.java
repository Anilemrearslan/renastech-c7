package day04_Operators;

public class topic3_AssignmentOperations {

    public static void main(String[] args) {
        int a= 80;
        System.out.println("the a value is: "+a);

        a=90; // a value is 90 now.
        System.out.println("the value now is: "+a);

        a= a + 40;// get a value add 40 and assign back to a;
        System.out.println("the value now is: "+a);

        a= a + 40;//this point a =170
        System.out.println("the value now is: "+a);

        a=5000000;
        System.out.println("the value is "+ a);

        //a= a+40
        a+=40;

        System.out.println(" the new value of a: "+ a);

        int b=100;
        b= b-30;
        System.out.println("the b value is: "+b);

        b-=10;
        System.out.println("the new value of b: "+b);

        int theAnswer= b-a;
        System.out.println("the answer: "+theAnswer);
    }
}
