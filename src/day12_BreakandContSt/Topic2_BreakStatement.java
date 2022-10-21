package day12_BreakandContSt;

public class Topic2_BreakStatement {

    public static void main(String[] args) {
        // break statement
        // we use the break statement in for loop to get out of the loop when certain condition are met

        for (int i = 0; i < 10; i++) {
            System.out.println("this is a code line");
            break;
        }

        System.out.println("this is out side of the for loop");
        for (int i = 0; i < 10; i++) {
            break;
           // System.out.println("this is a code line");//After break unreachable

        }
    }
}
