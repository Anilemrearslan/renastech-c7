package day12_BreakandContSt;

public class Topic3_BreakExample {

    public static void main(String[] args) {
        //write a code when speed limit is hit, stabilize the speed at the speed limit
        //the speed limit is 75
        int speed = 0;
        for (int i = 0; i <170; i++) {

            speed ++;//this will run 170 times
            if (speed==75){
                break;
            }

        }

        System.out.println("The speed is: "+speed);




    }
}
