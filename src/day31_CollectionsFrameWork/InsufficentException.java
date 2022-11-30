package day31_CollectionsFrameWork;

public class InsufficentException extends Exception{

    String message;

    public InsufficentException(){
        message = "you don't have enough money in your account";
    }

}
