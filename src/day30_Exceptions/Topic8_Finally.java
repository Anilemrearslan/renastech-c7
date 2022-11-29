package day30_Exceptions;

public class Topic8_Finally {
    public static void main(String[] args) {
        try {
            //my code go here
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is an exception");
        }finally {
            // After you execute the code in try block
            // come here and run below code
            // no matter you got an exception or not!
            System.out.println("this code is in finally");
        }

        try{
            System.out.println("open a File");
            /*
            do something about file
             */
        }finally {
            System.out.println("Close the File!");
        }

        /*
        try{
        }
        catch{
        }
        catch{
        }
        finally{
        }

        try{
        }
        catch{
        }
        catch{
        }


        try{
        }
        finally{
        }

        catch(){
        }
        try{
        }

        //below combination are wrong

        catch(){
        }
        finally{
        }

        try(){
        }
        finally{
        }
        finally{
        }

         try(){
        }

         try(){
        }
         catch(){
        }
        another code
        finally{
        }
         */
    }
}
