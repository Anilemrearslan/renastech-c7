package day33_StringBuilderAndFileOperations;

import java.io.BufferedReader;
import java.io.FileReader;

public class Topic5_BufferedReader {
    public static void main(String[] args) throws Exception{

        FileReader FR = new FileReader("C:/Users/anile/Desktop/Day33/test.txt");
        BufferedReader MyReader = new BufferedReader(FR);

        String line = MyReader.readLine();
//        System.out.println(line);
//        line = MyReader.readLine();
//        System.out.println(line);
//        line = MyReader.readLine();
//        System.out.println(line);

        while (line != null){
            System.out.println(line);
            line = MyReader.readLine();
        }
    }
}
