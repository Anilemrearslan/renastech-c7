package day15_NestedLoops;

public class Topic1_WhileNestedLoops {

    public static void main(String[] args) {
      /*
        while(condition){
            //code block
            while (condition2){
                //code block
            }
        }
        */

        int i=0;
        while(i < 10){

            System.out.println("\t the value of i: "+i);

            int j=1;
            while(j<10){
                System.out.println("for each i: "+i+" the value of j: "+j);
                j++;
            }
            i++;

        }



    }//end of main
}//end of class
