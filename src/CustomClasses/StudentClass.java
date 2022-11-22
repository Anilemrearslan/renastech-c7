package CustomClasses;

import java.util.ArrayList;

public class StudentClass {
    // Fields
    public String Name;
    public String StudentNumber;

    private ArrayList<Integer> HomeWorkResults;



    //Constructor
    public StudentClass(){
        HomeWorkResults = new ArrayList<Integer>();
        System.out.println("someone created StudentClass");

    }


    ///AddHomeworkResult : this method will add a result to your homework
    //Retun Type = no return
    ///@param1 is an Integer value

    public void AddHomeworkResult(Integer param1){
        HomeWorkResults.add(param1);
    }


    ///GetMean : This method will calculate Mean and return
    ///Return type = double
    /// no parameter

    public double GetMean(){
        int sum = 0;
        for (int i = 0; i < HomeWorkResults.size(); i++) {
            sum = sum + HomeWorkResults.get(i);
        }

        double mean =sum/HomeWorkResults.size();
        return mean;
    }


}
