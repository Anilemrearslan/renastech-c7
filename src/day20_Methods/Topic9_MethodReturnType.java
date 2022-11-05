package day20_Methods;

public class Topic9_MethodReturnType {

    public static void main(String[] args) {


        System.out.println("the food is : "+kitchen(" Tometoes "," SeaSolt "," OliveOils "));

        int result = sum2nums(45,23);
        System.out.println("the result is = " + result);
        System.out.println("the result also is: "+sum2nums(2, 67));

    }


    public static String kitchen(String veggies,String salt,String oil){

        String food= veggies+salt+oil;
        return "Menemen";
        /*
        Access Modifiers Specifiers Return Type(String, int, Object, Array, list) MethodName(params){


        code block

        return a value or a variable which is the same data type with your Return type


        }
         */
    }

    public static int sum2nums(int a,int b){
        int sum= a+b;
        return sum;// return a+b; //return 12;

    }









}
