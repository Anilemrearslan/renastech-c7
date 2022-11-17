package day25_Classes;

public class Topic4_StaticMethods {

    public static void main(String[] args) {

        CupCakeMold MyCupCake =new CupCakeMold();
        MyCupCake.Getsyle();

//        CupCakeMold.Getsyle();
//        CupCakeMold.School
    }
}


class CupCakeMold{
    //Fields
    static String School = "RenasTech";

    /*
    static means that the field or method marked as such is available at the class level.
    In other words, you don't need to create an instance of the class to access it.

    So instead of creating a copy of CupCakeMold then calling Getstyle() like this
    CupCakeMold MyCupCake =new CupCakeMold();
    MyCupCake.Getsyle();

    You can call the method directly against the class, like so:
    CupCakeMold.Getsyle();

    The class is a CupCakeMold
    and the object is the copy of the made with cupcake mold.
    A static methods belongs to cupcake mold and can be accessed directly without making and copies;
    Hence, in the example above, we can use GetStyle() directly.
     */
    public static void Getsyle(){
        System.out.println("Tornado");
    }
}