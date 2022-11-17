package day24_ArrayList;

import java.util.ArrayList;

public class Topic5_StandartDeviation {


    public static void main(String[] args) {
        ArrayList<Integer> MyDataSet = new ArrayList<>();

        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(10);
        MyDataSet.add(8);
        MyDataSet.add(8);
        MyDataSet.add(4);

        int n =MyDataSet.size();

        int sum= 0;
        for (int i = 0; i < n; i++) {
            sum = sum+MyDataSet.get(i);
        }
        System.out.println(sum);

        int mean = sum / n;
        System.out.println("mean = " + mean);

        ArrayList<Integer> MyCalculatedVariance = CalculateVarianceArrayList(MyDataSet,mean);

        System.out.println(MyCalculatedVariance);

        double SumOfVariance = 0;
        for (int i = 0; i < MyCalculatedVariance.size(); i++) {
            SumOfVariance+=MyCalculatedVariance.get(i);
//            below code same as above
            //SumOfVariance = SumOfVariance + MyCalculatedVariance.get(i);
        }

        System.out.println("Sum of the variance ArrayList : "+SumOfVariance);

        double ValueOfVariance = SumOfVariance / (n - 1);
        System.out.println("variance = " + ValueOfVariance);

        double StandartDeviation = Math.sqrt(ValueOfVariance);

        System.out.println("StandartDeviation = " + StandartDeviation);

    }



    /// This method will calculate variance of given ArrayList
    /// @param1 = this is an ArrayList that you wil pass your Data set
    /// @param2 = this is an int that you will pass your calculated mean value
    public static ArrayList<Integer> CalculateVarianceArrayList (ArrayList<Integer> MyDataSet , int mean){

        ArrayList<Integer> variance = new ArrayList<>(MyDataSet.size());

        for (int i = 0; i < MyDataSet.size(); i++) {

//            variance.set(i, MyDataSet.get(i) - mean); This will trow an error as the size of an ArrayList = 0
             variance.add(i, MyDataSet.get(i) - mean);
        }

        for (int i = 0; i < variance.size(); i++) {

            int squareOfElements = variance.get(i)*variance.get(i);
            //Below code will calculate power of given value . Same as above as we are sending 2 as pow
//            double squareOfElementsUsingPOW= Math.pow( variance.get(i),2);

            variance.set(i,squareOfElements);

        }



        return variance;

    }
}
