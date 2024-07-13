//package Java_Day-7.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {
    public static void main(String[] args) {
        
        try{
        FileReader reader = new FileReader("Read_example.txt");
        int data = reader.read();
        while(data != -1){
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();

    }
    catch(FileNotFoundException e){
        e.printStackTrace();
    }
    catch (IOException e){
        e.printStackTrace();
    }
    }
}
