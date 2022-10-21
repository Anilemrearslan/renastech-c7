package day12_BreakandContSt;

public class Topic5_ContinueStatement {

    public static void main(String[] args) {
        //we use continue key word to disregard that iteration when certain conditions are met

        for (int i = 0; i < 10; i++) {
            System.out.println("THe i value each iteration: "+i);
            if (i == 5){
                continue;
            }
            System.out.println("THe i value each iteration: "+i);

        }







    }
}
