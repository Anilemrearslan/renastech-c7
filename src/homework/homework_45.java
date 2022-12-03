package homework;

import java.util.ArrayList;

public class homework_45 {
    /*
    Write a Method where it takes an Integer of ArrayList and returns to an Integer ArrayList where it contains only unique numbers
    ex:   list     ==>   {1,1,2,3,3,4,5,6}
    result   ==>   {2,4,5,6}

    Please create a method with an Arraylist of Integer parameter.
    Return an Arraylist of Integer.
    Please define a method name that makes sense about what this method doing.
    In your method you will find unique numbers in parameter and you will add them to your return arraylist
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("before removing duplicates "+numbers);

        System.out.println("********************");

        System.out.println("After removing duplicates "+GetUniqueNumbers(numbers));


    }

    public static ArrayList<Integer> GetUniqueNumbers(ArrayList<Integer> param1){

       ArrayList<Integer> UniqueArrayList = new ArrayList<>();
        for (int i = 0; i < param1.size(); i++) {
            int count = 0;

            for (int j = 0; j < param1.size(); j++) {
                if (param1.get(i)==param1.get(j)){
                    count++;
                }
            }

            if (count == 1){
                UniqueArrayList.add(param1.get(i));
            }

        }
        return UniqueArrayList;
    }
}
