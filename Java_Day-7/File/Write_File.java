//package Java_Day-7.File;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
    public static void main(String[] args) {
       
        try{
        FileWriter writer = new FileWriter("Write_File_example.txt");
        writer.write("Nagaraj Loni \n3rd Sem \nBiTM Ballaari\nLike Color");
        writer.append("\n------------------>NS-Loni");
        writer.close();
    }
    catch (IOException e){
        e.printStackTrace();
    }
    }
}
