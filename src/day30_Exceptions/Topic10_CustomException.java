package day30_Exceptions;

public class Topic10_CustomException {
    public static void main(String[] args) {
        try {
            ValidDateAge(15);
        }catch (NotEligibleTOVoteException e){
            System.out.println(e.message);
        }


         try {
             throw new NoSuchFieldException();
         }catch (NoSuchFieldException e){
             System.out.println("I handled NoSuchFieldException ");
         }


    }

    /*
    About exception handling you need to know below keywords

    try
    catch
    finally
    throw
    throws
     */
    public static void ValidDateAge(int param1) throws NotEligibleTOVoteException {
        if (param1<18){
            throw new NotEligibleTOVoteException("you can't vote!!!");
        }else {
            System.out.println("you can vote");
        }

    }
}

 class NotEligibleTOVoteException extends Exception{
    String message;
    /// please create constructor for this class whit one String parameter

     public  NotEligibleTOVoteException(String param1){
         message=param1;
     }
 }