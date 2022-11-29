package day30_Exceptions;

public class Topic9_FinallyCont {
    public static void main(String[] args) {
        try {
            System.out.println("do something");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally");
        }

        //final, finally, finalize()

        // another code starts here
        System.out.println("no Finally");

        /*
    What is the difference between error and exception in Java?
    Errors are mainly caused by the environment in which an application is running.
    For example, OutOfMemoryError happens when JVM runs out of memory.
    Whereas exceptions are mainly caused by the application itself.
    For example, NullPointerException occurs when an application tries to access null object.
    -- what are checked and unchecked exceptions in java?
    Checked exceptions are the exceptions which are known to compiler.
    These exceptions are checked at compile time only. Hence, the name checked exceptions.
    These exceptions are also called compile time exceptions.
    Because, these exceptions will be known during compile time.
    Unchecked exceptions are those exceptions which are not at all known to compiler.
    These exceptions occur only at run time.
    These exceptions are also called as run time exceptions.
    All sub classes of java.lang.RunTimeException and java.lang.Error are unchecked exceptions.
     */


    }
}
