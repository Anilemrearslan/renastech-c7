package CustomClasses;

public class RectangleClass {
//    Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two
//    methods to print the area and perimeter of the rectangle respectively. Its constructor
//    having parameters for length and breadth is used to initialize length and breadth of the rectangle.


    //Encapsulation
    // public, private, protected and Default

    public int length;
    public int Breadth;


    // contructor
    //will take 2 parameters
    //public ClassName(parametertype parametername,...)
    public RectangleClass(int param1, int param2){
        length=param1;
        Breadth=param2;
    }


    ///PrintArea : This method will print the Area of rectangle
    //return type = void
    // no parameters

    // publicorPrivate StaticOrNot returntype Method name(parameterstype parametername,.......)

    public void PrintArea(){
        System.out.println("The area = "+length*Breadth);
    }


    ///PrintPerimeter : This method will print perimeter of rectangle
    /// return type void
    /// no parameters
    /// 2(l+b)
    public void PrintPerimeter(){
        System.out.println("the perimeter = "+ (2*(length+Breadth)));
    }



}
