package Day28_InheritanceandAbstraction;

import java.nio.file.Watchable;

public class  Topic3_Abstraction {

    public static void main(String[] args) {
        cat Mycat = new cat();
        Mycat.Walk();

        Dolphin MyDolphin = new Dolphin();
        MyDolphin.Swim();

        Lion MyLion = new Lion();
        MyLion.Walk();

        System.out.println("------------------------");
        TerrestrialAnimals AnAnimal;
        AnAnimal =new Lion();
        AnAnimal.Walk();
    }

}

//the animals which live in water. Example : Octopus , Fish, Shark
interface AquaticAnimals{
    void Swim(); //This is an ABSTRACT  method
}

//the animals which live in land. Example : Cow, Lion, deer
interface TerrestrialAnimals{
    void Walk();
}

class cat implements TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("Cat is walking");
    }
}
//what is different between extend and implement keywords.
class Lion extends cat{
    @Override
    public void Walk() {
        System.out.println("lion is walking");
    }
}

class Dolphin implements AquaticAnimals{
    @Override
    public void Swim() {
        System.out.println("Dolphin is swimming");
    }
}

// can you implement a class from more than one interface? Answer is yes
class Penguin implements AquaticAnimals, TerrestrialAnimals{
    @Override
    public void Walk() {
        System.out.println("penguin is walking");
    }

    @Override
    public void Swim() {
        System.out.println("penguin is swimming");
    }
}

// can you extend a class from more than one class?
//NO Class cannot extend multiple calsses
/* I connot write below code
class Tiger extends cat,Lion{

}
 */
