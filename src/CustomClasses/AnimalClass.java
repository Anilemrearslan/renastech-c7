package CustomClasses;

public class AnimalClass {
    public String AnimalName;
    public String AnimalType;

    public String AnimalColor;

    //this is a constructor
    //this will be called when you create your class
    ///@param1 is String variable and we will be use it as AnimalName
    ///@param2 is String variable and we will use ut as AnimalType

    public AnimalClass(String param1, String param2){
        AnimalName = param1;
        AnimalType = param2;
    }


    //HOw to define a Constructor
    //public ClassName (parameterType ParameterName, ......)


    //this will be called when you create your class
    ///@param1 is String variable, and we will be use it as AnimalName
    ///@param2 is String variable, and we will use ut as AnimalType
    ///@Param3 is String variable, and we will use is as AnimalColor
    public AnimalClass(String param1, String param2, String param3){
        AnimalName = param1;
        AnimalType = param2;
        AnimalColor = param3;
    }
    public void AMethod(String param3){
        System.out.println(param3);
    }
}
