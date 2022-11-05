package day20_Methods;

public class Topic7_MethodsParams {
    //  write a method where it takes to integers as parameters and prints result of sum of those numbers

    public static void SumTwoNumbers(int a,int b){
        int sum = a+b;
        System.out.println("the result is: "+sum);

    }

    public static void main(String[] args) {
        SumTwoNumbers(40,90);
        System.out.println("++++++++++++++++++++++++");
        SumTwoNumbers(92,45);
        System.out.println("++++++++++++++++++++++++");
        SumTwoNumbers(93,-123);
    }
}
