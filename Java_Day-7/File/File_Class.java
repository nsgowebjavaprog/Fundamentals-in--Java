import java.io.File;
import java.util.*;

public class File_Class {

    public static void main(String[] args) {
        
        File file = new File("File_exmaple.txt");  //File is existed!

        if(file.exists()){
            System.out.println("File is existed! ");
            System.out.println(file.getPath());         //File_exmaple.txt
            System.out.println(file.getAbsolutePath());  //E:\Java Course\Master-Java\Java_Day-7\File\File_exmaple.txt
            System.out.println(file.isFile());  //true

            // file.delete();
        }
        else{
            System.out.println("That File Does't Existed !");
        }

    }
    
}
