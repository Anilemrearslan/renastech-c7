package day30_Exceptions;

public class Topic4_CheckedExceptions {
    public static void main(String[] args) {

        try {
            Class.forName("Something");
        }catch (Exception e){
            System.out.println("you got an Error!!!");
        }


    }
}
