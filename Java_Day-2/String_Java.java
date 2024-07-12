import java.util.*;

public class String_Java {
    public static void main(String[] args) {
        String name = "Nagaraj";

        boolean res1 = name.equals("Nagaraj");    //true
        System.out.println(res1);

        int res2 = name.length();   // 7
        System.out.println(res2);  

        char res3 = name.charAt(0);  // N
        System.out.println(res3);  

        int res4 = name.indexOf("N");   // 0
        int res5 = name.indexOf("ga");  //2
        System.out.println(res4);
        System.out.println(res5);

        boolean res6 = name.isBlank();   //false
        System.out.println(res6);

        boolean res7 = name.isBlank();   //false
        System.out.println(res7);

        String res8 = name.toUpperCase();    //NAGARAJ
        System.out.println(res8);

        String res9 = name.trim(); // remove places

        String res10 = name.replace("j", "J");
        System.out.println(res10);  //NagaraJ
    }
}
