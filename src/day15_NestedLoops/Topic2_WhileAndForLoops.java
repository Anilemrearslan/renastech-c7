package day15_NestedLoops;

public class Topic2_WhileAndForLoops {

    public static void main(String[] args) {

        int i =0;
        while(i<10){

            System.out.println("the value of i: "+i);//this code will get executed 10 times


            for (int j = 1; j < 10; j++) {
                System.out.println("\t for each i: "+i+" value of the j: "+j);//this code will get executed 90 times
            }                                                           //for each i value it will get executed 9 times

            i++;

        }


    }
}
