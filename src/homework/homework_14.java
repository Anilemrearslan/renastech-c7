package homework;

import java.util.Scanner;

public class homework_14 {
//    Write a code where user is being asked to enter a name:
//            if Name Starts with "A" and ends with "L" replace "A" with "B" and print the result
public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = scan.next();
    String rename="";

    if (name.startsWith("A")&&name.endsWith("L")){
        rename=name.replace('A','B');

    }else if (name.startsWith("a")&&name.endsWith("l")){

        rename=name.replace('a','B');

    } else if (name.startsWith("a")&&name.endsWith("L")){

        rename=name.replace('a','B');

    } else if (name.startsWith("A")&&name.endsWith("l")) {

        rename=name.replace('A','B');

    }else {
        System.out.println("doesn't match with criteria");
    }
    System.out.println("rename = " + rename);

}


}
