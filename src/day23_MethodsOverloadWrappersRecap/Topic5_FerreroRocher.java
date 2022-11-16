package day23_MethodsOverloadWrappersRecap;

import java.util.ArrayList;

public class Topic5_FerreroRocher {

    public static void main(String[] args) {
        int chocolate = 5;
        Integer WrappedChocolate = new Integer(chocolate);

        ArrayList<Integer> mybox = new ArrayList<Integer>();

        mybox.add(WrappedChocolate);

        int unWrappedChocolate= WrappedChocolate.intValue();

        //mybox.add(chocolate);// it will work in version 5


    }
}
