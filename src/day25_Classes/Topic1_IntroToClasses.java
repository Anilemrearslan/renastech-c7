package day25_Classes;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic1_IntroToClasses {

    public static void main(String[] args) {
        String Car1Make = "Ford";
        String Car1Model= "Mustang";
        String Car1Color = "Red";

        PrintCar(Car1Make, Car1Model, Car1Color);

        line();

        String Car2Make = "BMW";
        String Car2Model = "M3";
        String Car2Color = "Black";

        PrintCar(Car2Make, Car2Model , Car2Color);

        line();

        Car MySportsCar = new Car();
        MySportsCar.Make = "Subaru";
        MySportsCar.Model = "BRZ";
        MySportsCar.Color = "Blue";
        MySportsCar.ModelYear = 2021;

        PrintCarClass(MySportsCar);

    }
    ///This method will print Car specifications
    ///@param1 is a car class that will we use as our parameter
    public static void PrintCarClass(Car param1){
        System.out.println("Make : "+param1.Make);
        System.out.println("Model : "+param1.Model);
        System.out.println("Color : "+param1.Color);
        System.out.println("Year : "+param1.ModelYear);
    }

    /// This method will print car specifications
    /// @param1 is a String parameter that we will use as make name
    /// @param2 is a String parameter that we will use as model name
    /// @param3 is a String parameter that we will use as color name
    public static void PrintCar(String param1, String param2 , String param3){
        System.out.println("Make : "+param1);
        System.out.println("Model : "+param2);
        System.out.println("color : "+param3);

    }
}

class Car{
    // Fields
    String Make;
    String Model;
    String Color;
    int ModelYear;
}


