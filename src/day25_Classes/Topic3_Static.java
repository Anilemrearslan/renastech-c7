package day25_Classes;

public class Topic3_Static {

    public static void main(String[] args) {
        RenasTechStudentRegistrationForm MyForm = new RenasTechStudentRegistrationForm();
        MyForm.Name = "Hayri";
        MyForm.SurName = "Aslan";

        System.out.println(MyForm.Name);

        RenasTechStudentRegistrationForm MyNewForm = new RenasTechStudentRegistrationForm();

        System.out.println(MyNewForm.Name);

    }
}


class RenasTechStudentRegistrationForm{
    /*
    The static keyword in java mainly used for memory management.
    The static variable can be used to refer the common property of all objects
    (which is not unique for each object)
    In other words, a static fields is shared by all copied of the class thus all see the same.

    for example the company name or collage ec.
    suppose there are 500 students in the collage. That's mean 500 student registration form.
    Now all fields will get memory each time when you create the Object (your registration form)
    all students has its unique name and surname. So fields are good in such case.
    Here "school" refers to common Field of all copy of Objects.
    If we make it static, tis field will get te memory only once.
     */
    String Name;
    String SurName;

    static String school = "RenasTech";

}