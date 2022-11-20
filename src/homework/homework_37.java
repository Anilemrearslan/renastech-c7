package homework;

public class homework_37 {
//    write a method where it takes 2 double values and 1 integer value.
//    When the integer value is 1 it returns to sum of the 2 double numbers,
//    when integer is 2 it returns the subtraction of those 2 double number,
//    when integer value is 3 it returns to the multiplication of those 2 double numbers,
//    and when the integer value is 4 it returns the division of those 2 double numbers

    public static void main(String[] args) {
        System.out.println(numbers(1, 25.33, 2.5));
        System.out.println(numbers(2, 25.33, 2.5));
        System.out.println(numbers(3, 25.33, 2.5));
        System.out.println(numbers(4, 25.33, 2.5));


    }

    /// @num1 is integer that you choose what type of calculation you want to do
    /// 1 for sum, 2 for sub, 3 for multi, 4 for div
    /// @num2 is double and assume it is bigger number
    /// @num3 is double and assume it is smaller number

    public static double numbers(int num1, double num2, double num3){

        if (num1 == 1){
            return num2+num3;
        }else if (num1 == 2){
            return num2-num3;
        }else if (num1 == 3){
            return num2*num3;
        } else if (num1 == 4) {
            return num2/num3;
        }else{
            return -1;
        }

    }
}
