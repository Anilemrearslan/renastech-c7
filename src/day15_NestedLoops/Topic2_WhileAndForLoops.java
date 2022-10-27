package day15_NestedLoops;

public class Topic2_WhileAndForLoops {

    public static void main(String[] args) {

        int i =0;
        while(i<10){

            System.out.println("the value of i: "+i);


            for (int j = 0; j < 10; j++) {
                System.out.println("for each i: "+i+" value of the j: "+j);
            }

            i++;

        }


    }
}
