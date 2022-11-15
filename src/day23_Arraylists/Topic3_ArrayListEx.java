package day23_Arraylists;

import java.util.ArrayList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic3_ArrayListEx {

    // write a method where it takes arraylist of Strings as input parameters and returns and Arraylist where
    // all the duplicates are removed;

    public static void main(String[] args) {
        // remove(index) ----> removes the element in that index

        ArrayList<String>SH = new ArrayList<>();

        SH.add("Deniz");
        SH.add("Gulay");
        SH.add("Banu");
        System.out.println("the list is: "+SH);

        SH.remove(1);
        System.out.println("the list is: "+SH);

        // remove (Object) -- it takes the object as well
        SH.remove("Banu");
        System.out.println("the list is: "+SH);

        line();

        ArrayList<Integer> IN = new ArrayList<>();

        IN.add(0);// index 0
        IN.add(1);// index 1
        IN.add(5);
        IN.add(2);
        IN.add(4);
        System.out.println("the list for IN is: "+IN);

        //IN.remove(2); // removes index 2

        IN.remove(Integer.valueOf(2));

        System.out.println("the list for IN is: "+IN);

        IN.remove(2);
        System.out.println("the list for IN is: "+IN);


    }
}
