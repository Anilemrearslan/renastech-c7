package Day28_InheritanceandAbstraction;

public class Topic4_AbstractClasses {

    public static void main(String[] args) {

    }
}

abstract class Bakery{
    String Name;
    public Bakery(){
        //this is your constructor
    }
    abstract void setCreme();

    public void EatSomething(){
        System.out.println("you are eating something ");
    }

}

class Danish extends Bakery{
    @Override
    void setCreme(){

    }
}

// can interfaces have constructors?
//No. Interfaces can't have constructors. They show 100% abstractness.
interface CremeBrule{
    void Eat(); //This is an ABSTRACT method
}