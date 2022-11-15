package day23_Arraylists;

import java.util.ArrayList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic2_ArrayListMethods {

    public static void main(String[] args) {

        //get(index) --> it is used to get a specific object from the index

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(0);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(8);

        //list1.size(); // this will return 5
        int num5 = list1.get(3);

        System.out.println("the number that is in index 3 is: "+num5);

        line();

        //write a code that will print every element inside of array list one by one
        // list1 = [0,2,3,5,8]

        for (int i = 0; i < list1.size(); i++) {
            System.out.println("the number that is in index "+i+" is: "+list1.get(i));
        }

        //System.out.println("the number that is in index 10 is: "+list1.get(10));//this will show an error out of bound
        line();


        //indexof() this will return the index of the value that you specified

        ArrayList<Character> CH = new ArrayList<>();

        CH.add('g');
        CH.add('t');
        CH.add('i');
        CH.add('q');
        CH.add('b');


        int index = CH.indexOf('q');
        System.out.println("the index of 'q' is: "+index);

        // if the item that you want the index for is not in the arraylist it will return -1

        System.out.println("the index of 'a' : "+CH.indexOf('a'));

        CH.add('i');
        // if the item that you want is there multiple times indexof() will return the First index that has been found
        System.out.println("the isdex of 'i' is: "+CH.indexOf('i'));

        line();
        // set(index, item); this take 2 parameters which one is the index and the other one is the item

       ArrayList<String> ST = new ArrayList<>();
       ST.add("Eda");
        ST.add("Jason");
        ST.add("Raz");
        ST.add("Yaseen");
        ST.add("Seray");

        System.out.println("The ArrayList is: "+ST);

        ST.set(1,"Sam");
        System.out.println("The ArrayList is: "+ST);

        ST.set(ST.indexOf("Seray"), "Bahar");
        System.out.println("The ArrayList is: "+ST);

    }
}
