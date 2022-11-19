package Day26_ClassesAndConstructors;

import CustomClasses.AnimalClass;
import CustomClasses.StudentClass;

public class Topic3_StudentNumber {
    public static void main(String[] args) {
        StudentClass MyStudent = new StudentClass();
        MyStudent.Name = "Sefa";
        MyStudent.StudentNumber = "987";

        AnimalClass MyAnimal = new AnimalClass("Lion","Cat");
        MyAnimal.AMethod("something");
        System.out.println(MyAnimal.AnimalName);
        MyAnimal.AnimalName = "Leopar";
        System.out.println(MyAnimal.AnimalName+" "+MyAnimal.AnimalType);

        AnimalClass Mytiger = new AnimalClass("Tiger","Cat");

        /*
        we don't need this code as I can define the name and type on creating construction
        AnimalClass MyAnimal = new AnimalClass();
        MyAnimal.AnimalName = "Loin";
        MyAnimal.AnimalType = "Cat";
         */

        AnimalClass MyPenguin = new AnimalClass("penguin","Bird","White-Black");
        System.out.println(MyPenguin.AnimalName+" "+MyPenguin.AnimalType+" "+MyPenguin.AnimalColor);
    }
}
