package day14_NestedLoops;

public class Topic5_NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            System.out.println("this is the first outer loop");
            for (int j = 0; j < 3; j++) {

                System.out.println("\t this is second outer/ inner");
                for (int k = 0; k < 3; k++) {

                    System.out.println("\t \t this is second inner");
                }
            }
        }


    }
}
