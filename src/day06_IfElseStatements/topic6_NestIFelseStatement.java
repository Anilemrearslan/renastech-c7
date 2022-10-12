package day06_IfElseStatements;

public class topic6_NestIFelseStatement {

    public static void main(String[] args) {

        //Last Names = Doe, Yilmaz , Ekinci
        //if last name is yilmaz and age is over 20 print the last name and the age if not just print the name
        //if lastname is doe and the age is over 10 print just last name if not print the just age
        //if it is ekinci print last name and age.

        String Lastname="ekinci";
        int age=1;

        if(Lastname=="yilmaz"){

            if (age>20){
                System.out.println("the lastname is "+Lastname+" the age is: "+age);
            }else{
                System.out.println("just lastname: "+Lastname);
            }

        }else if (Lastname == "Doe"){
            if (age>10){
                System.out.println(" just the lastname " + Lastname);
            }else {
                System.out.println(" just age is : "+age);
            }
        }else{
            System.out.println("lastname: "+Lastname+" Age: "+age);
        }
















    }
}
