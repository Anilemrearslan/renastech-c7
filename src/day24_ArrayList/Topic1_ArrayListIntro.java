package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Topic1_ArrayListIntro {

    public static void main(String[] args) {

        int [] MyOldArray = new int[3];

        MyOldArray[0] = 55;
        MyOldArray[1] = 47;
        MyOldArray[2] = 99;

        System.out.println(Arrays.toString(MyOldArray));

        String [] MyOldStringArray = {"food","family","expense"};

        /*
        In Java wee need to declare the size of an array before we can use it.
        once size is declared, it is hard to change it

        to handle this issue, we can use ArrayList class.
         */

        ArrayList<Integer> MyNewArray = new ArrayList<Integer>();

        /*
        basic operations on ArrayList

        Add elements
        Acces (get) elements
        Change (set) elements
        Remove elements
         */

        MyNewArray.add(55);
        MyNewArray.add(47);
        MyNewArray.add(99);
        MyNewArray.add(108);

        MyNewArray.add(2,77);
        System.out.println(MyNewArray);









    }
}
