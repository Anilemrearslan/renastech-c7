package homework;

import java.util.ArrayList;

public class homework_47 {
    /*Write a Method where it takes a String parameter and returns an ArrayList of Integer.
The method will return All the numbers in the String
ex: String str = "This234 is ju3st St1in6"
    result = {2,3,4,3,1,6}
Hint: in order to check if Character is a number or not ( boolean check = Character.isDigit(str.charAt(i) )

     */

    public static void main(String[] args) {

        String str= "This234 is ju3st St1in6";
        System.out.println(str);
        System.out.println(ReturnNumbersInString(str));
    }

    public static ArrayList<Integer> ReturnNumbersInString(String param1){
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < param1.length(); i++) {
            boolean check = Character.isDigit(param1.charAt(i));
            if (check){
                String str = "" + param1.charAt(i);
                Integer temp = Integer.parseInt(str);
                numbers.add(temp);
            }
        }
        return numbers;
    }
}
