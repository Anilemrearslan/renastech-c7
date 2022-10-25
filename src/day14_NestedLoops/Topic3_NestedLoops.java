package day14_NestedLoops;

public class Topic3_NestedLoops {

    public static void main(String[] args) {
        // Nested Loops
        // Assume you have 3 different fruit each have 10. you want to give 10 people equally each one of the fruit

        for (int i = 0; i < 3; i++) {

            System.out.println("The distribution: "+i);
            for (int j=1; j<=10; j++){
                System.out.println("fruit: "+i+"for the kids: "+j);
            }

        }
        System.out.println("The fruits are distributed: ");



    }
}
