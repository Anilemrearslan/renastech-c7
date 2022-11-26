package homework;

public class Homework_43 {
    /*
    Write a method where it takes 2 String parameters as input and Concatenate them and returns to a string,
     but also could handle a situation where It takes 2 String and 1 integer value where it only prints the 2 strings by integer value times.
example -
ConcatandPrint("FirstName","LastName") it will return ==> "FirstName LastName" ConcatandPrint("FirstName","LastName",3)
it will print ==> "FirstName Lastname" 3 times.

Please create a method with return type String and with 2 String parameters.
Method name is ConcatandPrint;
This method will concatenate 2 parameters and return it.
Please create an overload method of ConcatandPrint with return type void and with 2 String and 1 Integer parameter.
This method will concatenate 2 parameters and print them param3 times
     */

    public static void main(String[] args) {

        System.out.println(ConcatAndPrint("Anil","Arslan"));

        System.out.println("*********************");

        ConcatAndPrint("Anil", "Arslan",5);

    }

    public static String ConcatAndPrint(String param1, String param2){

       return param1.concat(" " + param2);
    }

    public static void ConcatAndPrint(String param1, String param2, int param3){

        for (int i = 0; i <= param3; i++){
            System.out.println(param1.concat(" " + param2));
        }

    }
}
