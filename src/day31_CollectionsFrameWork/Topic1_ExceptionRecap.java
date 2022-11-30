package day31_CollectionsFrameWork;

public class Topic1_ExceptionRecap {
    public static void main(String[] args) {
        // dataType variblename = new constructor(parameter defined in constructor)

        BankAccount myBankAccount = new BankAccount(25);

        try{
            myBankAccount.Withdraw(100);
        }catch (InsufficentException e){
            System.out.println(e.message);
        }

        System.out.println("-----------------");
        myBankAccount.Deposit(100);


    }
}
