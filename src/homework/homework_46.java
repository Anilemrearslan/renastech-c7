package homework;

import java.util.ArrayList;

public class homework_46 {
    /*
    Write 3 methods where it takes the ArrayList of Double
1) first method returns the maximum number in the list
2) second metod returns the minimum number in the list
3) third Method prints all elements one by one on the same line
( example result = "the List is: 100.9, 12.45, 30.46" )

Please create 3 methods. All of them will have one parameter which is ArrayList of Double.
First and second methods will return a double.
Third method will not return something
     */

    public static void main(String[] args) {
        ArrayList<Double> ListOfNumbers = new ArrayList<>();
        ListOfNumbers.add(100.9);
        ListOfNumbers.add(12.45);
        ListOfNumbers.add(30.46);

        double MaxNumber = MaximimNumber(ListOfNumbers);
        double MinNumber = MinimumNumber(ListOfNumbers);
        System.out.println(MaxNumber);
        System.out.println(MinNumber);
        PrintAllNumbers(ListOfNumbers);

    }

    public static Double MaximimNumber(ArrayList<Double> param1){
        Double Max = param1.get(0);

        for (int i = 0; i < param1.size(); i++) {

            if (Max < param1.get(i)){
                Max = param1.get(i);
            }

        }

        return Max;
    }

    public static Double MinimumNumber(ArrayList<Double> param1){
        Double Min = param1.get(0);

        for (int i = 0; i < param1.size(); i++) {

            if (Min > param1.get(i)){
                Min = param1.get(i);
            }
        }

        return Min;
    }

    public static void PrintAllNumbers(ArrayList<Double> param1){

        System.out.println(param1);

    }
}
