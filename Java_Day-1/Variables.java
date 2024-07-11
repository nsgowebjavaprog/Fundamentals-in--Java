
public class Variables {
    public static void main(String[] args) {
        // booean-----1 bit
        // byte ---- 1 byte
        // short --- 2 byte
        // int --- 4 byte
        // long ---- 8 bytes
        
        // float ---- 4 bytes
        // double ----- 8 bytes
        // char ---- 2 bytes
        // String ------varies

        // Declaration

        int x;
        //Assignment
        x = 123;
        // Initialization
        int v = 223;
        // print

        System.out.println("Value of x: "+x);
   
        System.out.println("Value of x: "+v);

        byte a = 2;
        short b = 20;
        int c = 200;
        float d = 20.4f;
        double e = 34343434;
        long f = 12222222;
        char gender = 'M';
        String name = "CS-Coders";

        System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+gender+","+name);
    }
}
