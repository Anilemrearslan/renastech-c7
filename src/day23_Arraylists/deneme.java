package day23_Arraylists;

import java.util.ArrayList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class deneme {

    public static ArrayList<Integer> removeDuplicades(ArrayList<Integer> numbers){

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            numbers.remove(num);

            if (numbers.indexOf(i) == -1){
                numbers.add(i,num);
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> INT =new ArrayList<>();
        INT.add(7);
        INT.add(6);
        INT.add(8);
        INT.add(1);
        INT.add(7);
        INT.add(2);

        System.out.println(INT);

        line();

        System.out.println(removeDuplicades(INT));
    }
}
