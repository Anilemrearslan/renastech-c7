package day21_MethodsAndMethodOverload;

public class MethodOverLoading {

    /*
    three ways to over load method
    In order to overload a method, the parameters list of the methods must be different in either of
    1. Number of parameters
    valid case for overloading

    public static int add(int, int)
    public static int add(int, int, int)
    add(1,2)
    add(1,2,3)

    2.Data type of parameter
    public static int add(int, int)
    public static int add(int, float)
    add(1,2)
    add(1,1.3f)

    3.Sequence of parameter
    public static int add(float, int)
    public static int add(int, float)
    add(1.3f,2)
    add(1,1.3f)
     */

    public static void main(String[] args) {

        calculateNumbers(1,2);
        calculateNumbers(1,2,3);
        System.out.println(calculateNumbers(1, 1.5));
        System.out.println(calculateNumbers(1.5, 1));
    }

    private static void calculateNumbers(int number1, int number2){

        int sum= number1+number2;
        System.out.println(sum);
    }

    private static void calculateNumbers(int number1, int number2,int number3){

        int sum= number1+number2+number3;
        System.out.println(sum);
    }

    private static String calculateNumbers(int number1, double number2){
        double sum=number1+number2;


        return "Total is: "+ sum;
    }

    private static String calculateNumbers(double number2, int number1){
        double sum=number1+number2;


        return "Total is: "+ sum;
    }






}
