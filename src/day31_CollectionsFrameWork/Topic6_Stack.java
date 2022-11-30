package day31_CollectionsFrameWork;

import java.util.Stack;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic6_Stack {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();
        //push() method
        // to add element on top of the Stack
        MyStack.push("Dog");
        MyStack.push("Horse");
        MyStack.push("Cat");

        System.out.println(MyStack);

        //peek() Method
        // returns the element from the top of the Stack
        String MyPeek=MyStack.peek();
        System.out.println(MyPeek);

        //pop() method
        //Removing the first element (the element on top of the Stack)

        //Access and remove the element
        String MyPop = MyStack.pop();
        System.out.println(MyPop);
        System.out.println(MyStack);

        // search() method

        int position = MyStack.search("Horse");
        System.out.println(position);
        line();
        int position2 = MyStack.search("Monkey");
        System.out.println(position2);
    }
}
