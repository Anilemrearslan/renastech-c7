package day31_CollectionsFrameWork;

import java.util.PriorityQueue;

public class Topic7_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> MyQueue = new PriorityQueue<>();

        MyQueue.offer("Welcome");
        MyQueue.offer("To");
        MyQueue.offer("Java");
        MyQueue.offer("4");
        MyQueue.offer("Testers");

        System.out.println(MyQueue);

        //peek()
        System.out.println(MyQueue.peek());

        System.out.println("**************************");

        //pool
        while(!MyQueue.isEmpty()){
            String s2= MyQueue.poll();
            System.out.println(s2);
        }
    }
}
