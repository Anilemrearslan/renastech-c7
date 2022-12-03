package day33_StringBuilderAndFileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class Topic6_FileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter MyWriter = new FileWriter("C:/Users/anile/Desktop/Day33/newFile.txt");

        MyWriter.write("This is an example of file writer !!!");
        MyWriter.write("This is Second line");
        MyWriter.close();

    }
}
