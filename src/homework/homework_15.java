package homework;

import java.util.Scanner;

public class homework_15 {//bwogalagjeolgme

    //Write a Code where user is being asked to enter a sentence
    //if Sentence starts with "B" or "b" and ends with "E" or "e" also
    // contains "A" or "a" replace second and fourth characters with "G"
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter sentence");
        String sentence=scan.nextLine();
        String newsentence="";

        if ((sentence.startsWith("B") || sentence.startsWith("b"))&&
                (sentence.endsWith("E")||sentence.endsWith("e"))&&(sentence.contains("a")||sentence.contains("A"))){
            newsentence=sentence.substring(0,1)+'G'+sentence.substring(2,3)+'G'+sentence.substring(4);
            System.out.println("new sentence is: "+newsentence);
        }

    }
}
