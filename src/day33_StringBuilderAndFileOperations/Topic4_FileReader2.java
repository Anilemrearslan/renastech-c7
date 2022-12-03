package day33_StringBuilderAndFileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Topic4_FileReader2 {
    public static void main(String[] args) {
        try {
            FileReader FR = new FileReader("C:/Users/anile/Desktop/Day33/test.txt");

            int c2;
            while ((c2 = FR.read()) != -1){
                System.out.print((char) c2);
            }

            /*
            => Above code is same with below code <=

             int c =MyReader.read();

            while(c > -1){
                System.out.print((char)c);
                c = MyReader.read();
            }
             */


        }catch (FileNotFoundException e){
            System.out.println("File NOT found!");
        }catch (IOException e2){
            System.out.println("There is a problem while reading!");
        }

    }
}
