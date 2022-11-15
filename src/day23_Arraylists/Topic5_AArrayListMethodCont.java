package day23_Arraylists;

import java.util.ArrayList;

public class Topic5_AArrayListMethodCont {

    public static void main(String[] args) {
        //contains(object obj) ---> this method will check if arraylist has that object inside in the list
        //if it is return true else it returns false

        ArrayList<Integer> ArrL = new ArrayList<>();
        ArrL.add(3);
        ArrL.add(2);
        ArrL.add(0);
        ArrL.add(8);
        ArrL.add(39);
        System.out.println("the list is : "+ArrL);

        boolean isThere = ArrL.contains(60);
        System.out.println("the Answer is : "+isThere);

        System.out.println("The number 0 is in the ArrayList: "+ArrL.contains(0));

        // Equals() it checks if 2 arraylist are equal if they are it will return true else it will return false

        ArrayList<Integer> ArrL2 = new ArrayList<>();

        ArrL2.add(3);
        ArrL2.add(2);
        ArrL2.add(0);
        ArrL2.add(8);
        ArrL2.add(39);

        System.out.println("Are they equal: "+ArrL.equals(ArrL2));


        //isEmpty() --> it checks if arraylist is empty if it is it will return true else it will return false

        ArrayList<Character> CHarr = new ArrayList<>();

        System.out.println("Is it empty : "+CHarr.isEmpty());
    }
}
