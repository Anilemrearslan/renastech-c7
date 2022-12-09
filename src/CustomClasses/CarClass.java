package CustomClasses;

public class CarClass {
    // Fields
    public String Make;
    public String Model;
    public int Year;
    public double Speed;
    public String Color;

    private double Cost;

    // Methods

    public void SetAttributes(String Model, int Year, double Speed){
        this.Model = Model;
        this.Year = Year ;
        this.Speed = Speed;
    }

    public void PrintCar(){
        System.out.println("Model = "+Model);
        System.out.println("Year = "+Year);
        System.out.println("Speed = "+Speed);
    }

    public void IncreaseSpeed(double param1){
        Speed=Speed+param1;
    }

    public void DecreaseSpeed(double param1){
        Speed=Speed-param1;
    }
}
