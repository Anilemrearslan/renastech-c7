package Day28_InheritanceandAbstraction;

import java.util.ArrayList;

public class Topic2_Polymorphism {

    public static void main(String[] args) {
        Animal MyAnimal = new Animal();
        Animal MyDog = new dog();
        Animal Mypig = new pig();

        ArrayList<Animal> MyZoo = new ArrayList<>();
        MyZoo.add(MyAnimal);
        MyZoo.add(MyDog);
        MyZoo.add(Mypig);

        for (int i = 0; i < MyZoo.size(); i++) {
            Animal AnAnimal = MyZoo.get(i);
            AnAnimal.AnimalSound();

            // below code is same with the code above
            //MyZoo.get(i).AnimalSound();
        }

        /*
        Polymorphism means "many forms"
        In Java, Polymorphism means same object performing different operations according to the requirement.
        (in Java all classes inherit from Object.)
        in other words Polymorphism is simply the ability of an object to specialize its behavior based on its type.
        Polymorphism can be achieved by using two ways, those are
        Method overriding
        Method overloading
         */
    }
}

// class animal extends Object


class Animal{
    public void AnimalSound(){
        System.out.println("The animal makes a sound ");
    }

    public void AnimalSound(String param1){
        System.out.println(param1+" makes a sound");
    }

}


class dog extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The dog says: woof woof ");
    }
}

class pig extends Animal{
    @Override
    public void AnimalSound() {
        System.out.println("The pig says: oink oink");
    }
}