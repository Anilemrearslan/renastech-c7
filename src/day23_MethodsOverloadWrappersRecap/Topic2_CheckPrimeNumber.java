package day23_MethodsOverloadWrappersRecap;

public class Topic2_CheckPrimeNumber {

    public static void main(String[] args) {

        int num = 15;
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                IsItPrimeNumber = false;
                break;
            }
        }

        if (IsItPrimeNumber == true){
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is NOT a prime number");
        }

    }

 /*   public static boolean CheckPrimeNumbers(int param1){
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < param1; i++) {
            if ((param1 % i == 0) ){
                IsItPrimeNumber = false;
            }
        }
        return IsItPrimeNumber;
    }
  */
}
