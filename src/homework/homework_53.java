package homework;

public class homework_53 {
    /*
    Write a Class named "Login" where it has private data members of String Username and String Password.
    in you main create instance (Object) of Login class,  set those private data members Then Print Those Values
    Tip: use getters and setters

     */

    public static void main(String[] args) {

        login Credentials = new login();
        Credentials.SetNameAndPAssWord("Anil","123456789");
        System.out.println("Name: "+Credentials.GetName());
        System.out.println("PassWord: "+Credentials.GetPassword());
    }
}


class login{
    // fields
    private String Name;
    private String PassWord;


    public void SetNameAndPAssWord(String Name, String PassWord){
        this.Name= Name;
        this.PassWord=PassWord;
    }

    public String GetName(){
        return Name;
    }

    public String GetPassword(){
        return PassWord;
    }
}