package homework;

import CustomClasses.CarClass;

public class homework_50 {
    /*
    Write a Car Class where it has following attributes:
1) String Model
2) int Year
3) double speed
and following methods:
1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
2) PrintCar() - Where it prints each objects attributes
3) IncreaseSpeed() - Where it takes a double value and it increase the Speed attribute by input amount
4) DecreaseSpeed() - Where it takes a double value and it decrease the Speed attribute by input amount


Create 4 instance of Car Class, after Setting the Attribute values,
Apply increaseSpeed and DecreaseSpeed Multiple times for different values. For those which has speed of 80 or more,
Print warning such as Model Year, Speed and "Danger of getting ticket!"
Example: Tesla 2021, Speed: 106. Danger of getting ticket!
     */

    public static void main(String[] args) {
        CarClass Car1 = new CarClass();
        Car1.SetAttributes("Acura RDX", 2019, 55.0);
        CarClass Car2 = new CarClass();
        Car2.SetAttributes("Honda Accord",2022,65.5);
        CarClass Car3 = new CarClass();
        Car3.SetAttributes("Mercedes S-Class",2020,100.0);
        CarClass Car4 = new CarClass();
        Car4.SetAttributes("BMW 3-series",2021,80.0);

        Car1.IncreaseSpeed(26);
        Car2.IncreaseSpeed(10);
        Car3.DecreaseSpeed(6);
        Car4.DecreaseSpeed(15);

        if (Car1.Speed > 80){
            System.out.println(Car1.Year+" "+Car1.Model + " Danger of getting ticket! " + "Your Speed is : " + Car1.Speed);
        }else if (Car1.Speed < 80){
            System.out.println(Car1.Year+" "+Car1.Model + " You doing good!! " + "Your Speed is : " + Car1.Speed);
        }

        if (Car2.Speed > 80){
            System.out.println(Car2.Year+" "+Car2.Model + " Danger of getting ticket! " + "Your Speed is : " + Car2.Speed);
        }else if (Car2.Speed < 80){
            System.out.println(Car2.Year+" "+Car2.Model + " You doing good!! " + "Your Speed is : " + Car2.Speed);
        }

        if (Car3.Speed > 80){
            System.out.println(Car3.Year+" "+Car3.Model + " Danger of getting ticket! " + "Your Speed is : " + Car3.Speed);
        }else if (Car3.Speed < 80){
            System.out.println(Car3.Year+" "+Car3.Model + " You doing good!! " + "Your Speed is : " + Car3.Speed);
        }

        if (Car4.Speed > 80){
            System.out.println(Car4.Year+" "+Car4.Model + " Danger of getting ticket! " + "Your Speed is : " + Car4.Speed);
        }else if (Car4.Speed < 80){
            System.out.println(Car4.Year+" "+Car4.Model + " You doing good!! " + "Your Speed is : " + Car4.Speed);
        }

    }
}
