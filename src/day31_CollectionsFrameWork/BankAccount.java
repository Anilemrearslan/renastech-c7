package day31_CollectionsFrameWork;

public class BankAccount {
    double balance;

    ///please create a constructor that takes one double parameter

    public BankAccount(double param1){
        balance = param1;
    }

    ///Please create a method that takes a double as parameter
    ///no return
    ///this method will add the parameter to you balance
    ///method name = Doposit

    public void Deposit(double param1){
        balance= balance + param1;
        //balance += param1;
        System.out.println("Available balance : "+balance);
    }


    ///Please create a method that takes a double as parameter
    ///no return
    ///this method will add the parameter to you balance
    ///method name = Withdraw

    public void Withdraw(double param1) throws InsufficentException {
        if (balance < param1){
            throw new InsufficentException();
        }else {
            balance=balance-param1;
            System.out.println("Available balance : "+balance);
        }

    }
}
