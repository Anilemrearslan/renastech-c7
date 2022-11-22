package CustomClassesForHomework;

public class StudentINFORMATION {

    public String name;
    public String lastName;
    private int age = 34;

    public int SetNameandLastNameandReturnAge(String param1,String param2){

        System.out.println("My name is "+param1+" "+param2);

        return age;
    }
}
