package day15_NestedLoops;

public class Topic3_ForAndWhileNestedLoops {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.println("this is from outer loop: i: "+i);
            int j=1;
            while(j<10){
                System.out.println("this is from inner loop: "+j);
                j++;

            }
            for (int k=1; k<4;k++){
                System.out.println("this is from inner For Loop k value: "+k);
                System.out.println("this is the j value inside of the for loop: "+j);
            }



        }





    }//main
}//class
