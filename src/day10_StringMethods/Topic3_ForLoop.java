package day10_StringMethods;

public class Topic3_ForLoop {

    public static void main(String[] args) {
        /*

        for(starting point;  end point;  increase or decrease){

        code block

        }

         */
        for (int i=0; i<20; i++){
            System.out.println("the i value: "+ i);
        }

        System.out.println("**************************************");

        for (int i= 10; i<=90; i+=10){
            System.out.println("the i values: "+i);
        }

        System.out.println("**************************************");

        for (int i = 20; i >0 ; i--) {
            System.out.println("the value of i: "+i);
        }
        //System.out.println("the value of i: "+i);// This is error out because i is only accessible inside the loop









    }
}
