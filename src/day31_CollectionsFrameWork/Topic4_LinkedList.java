package day31_CollectionsFrameWork;

import java.util.LinkedList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic4_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList
        1- Implements List, Queue, and Deque interfaces.
        2- Stores 3 values (previous address, data, and next address) in a single position.
        3- Provides the doubly-linked list implementation.
        4- Whenever an element is added, prev and next address are changed.
        5- To access an element, we need to iterate from the beginning to the element.
        ArrayList
        1- Implements List interface.
        2- Stores a single value in a single position.
        3- Provides a resizable array implementation.
        4- Whenever an element is added, all elements after that position are shifted.
        5- Can randomly access elements using indexes.
        Use an ArrayList for storing and accessing data, and LinkedList to manipulate data
         */

        LinkedList<String> MyZoo = new LinkedList<>();
        MyZoo.add("Dog");
        MyZoo.add("Penguin");
        MyZoo.add("Cow");
        MyZoo.add("Monkey");

        System.out.println(MyZoo);

        //Queue Interface Methods
        /*
        addFirst()	adds the specified element at the beginning of the linked list
        addLast()	adds the specified element at the end of the linked list
        getFirst()	returns the first element
        getLast()	returns the last element
        removeFirst()	removes the first element
        removeLast()	removes the last element
        peek()	returns the first element (head) of the linked list
        poll()	returns and removes the first element from the linked list
        offer()	adds the specified element at the end of the linked list
         */

        //Access to first element
        String MyString1 = MyZoo.peek();
        System.out.println(MyString1);

        line();

        //Access and remove first element
        String MyString2 = MyZoo.poll();
        System.out.println(MyString2);
        System.out.println(MyZoo);

        line();

        MyZoo.offer("lion");
        System.out.println(MyZoo);


    }
}
