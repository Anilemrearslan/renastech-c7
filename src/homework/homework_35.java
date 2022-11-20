package homework;

public class homework_35 {
//    Write a method where it takes 2 strings as a parameter
//    and returns true when 2 strings are equal and returns false when they are not equal.?

    public static void main(String[] args) {
       boolean IsItEqual= EqualsMethod("lahmacun","lahmacun");
        System.out.println(IsItEqual);
    }

    public static boolean EqualsMethod(String param1,String param2){
        if (param1.equals(param2)){
            return true;
        }else {
            return false;
        }
    }
}
