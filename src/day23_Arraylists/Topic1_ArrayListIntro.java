package day23_Arraylists;

import java.util.ArrayList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic1_ArrayListIntro {

         //Data Structure:
        // 1. Array
        // 2. collection ==> only accepts objects
        // 3. map ==> only accepts objects

        // int [] arr = new Int[3];
        // Arraylist<Datatype> listName = new Arraylist<dataType>();
        //DataType can not be primitive
        // has to be wrapper class object or different object type
        //String [] name = new String[6];
        //String name = {"Ziya","DED","gtr"}; ===> arrays are static or size can not be changed

        //ArrayList: part of collections
        //           does not support primitives, only supports none primitives
        //           size is dynamic, automatically adjusted
        //           has index numbers

        //what is the differences between array and array list
        //1.size = array size is fixed and ; arraylist size is dynamic (flexible)
        //2.array accepts primitives arraylist doesn't accept primitives
        //3.arraylist is data structure and arraylist is part of collection data structure
        public static void main(String[] args) {

            // Arraylist<Datatype> listName = new Arraylist<dataType>();
            ArrayList<Integer> listname = new ArrayList<Integer>(); // size = 0
            // add() ---> this will add element at the end of the ArrayList
            listname.add(90); // =====> size of ArrayList will be 1; 90 will be assigned to index 0
            listname.add(80); // =====> size =2  80 will be assigned to index 1
            listname.add(84); // =====> size =3  84 will be assigned to index 2
            listname.add(85); // =====> size =4  85 will be assigned to index 3
            listname.add(93); // =====> size =5  93 will be assigned to index 4
            listname.add(90); // =====> size =6  90 will be assigned to index 5
            System.out.println(listname);

            //add(index,value) == it will add the value to a specific index and will move the rest index back

            listname.add(3,45);
            System.out.println("add 45 to a specific index: "+listname);

            listname.add(7,100);// add(100)
            System.out.println(listname);

            //listname.add(10,100); this will throw an error that out of bound
            //System.out.println(listname);


            //size() this method will give the size of arraylist

            int sz = listname.size(); // that will assign the size of listname to "sz" variable

            System.out.println("the size of the list name is: "+sz);
            line();
            ArrayList<Integer> list2 = new ArrayList<>();

            list2.add(list2.size(),90); // equals to just add()
            list2.add(list2.size(),9);
            list2.add(list2.size(),98);// == add(98)
            list2.add(list2.size(),2);// == add(2)
            System.out.println(list2);


        }

}
