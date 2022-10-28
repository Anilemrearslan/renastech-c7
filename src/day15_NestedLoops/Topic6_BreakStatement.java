package day15_NestedLoops;

public class Topic6_BreakStatement {

    public static void main(String[] args) {
        lbl:
        for (int i = 0; i<10; i++){

            System.out.println("From Outer loop i value: "+i);

            for (int j = 1; j <10 ; j++) {

                if (i==5){
                    break lbl;//break the outer loop to the label level
                }

                System.out.println("\t From inner loop i: "+i+"j value : "+j);
            }
        }

        System.out.println("***************************************************");


        CON:
        for (int i = 0; i<10; i++){

            System.out.println("From Outer loop i value: "+i);

            for (int j = 1; j <10 ; j++) {

                if (i==5){
                    continue CON;//break the outer loop to the label level
                }

                System.out.println("\t From inner loop i: "+i+"j value : "+j);
            }
        }







    }
}
