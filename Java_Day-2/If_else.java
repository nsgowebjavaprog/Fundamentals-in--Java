import java.util.*;

public class If_else {
    public static void main(String[] args) {
        
        System.out.println("Enter the Boy Age: ");

        Scanner sc = new Scanner(System.in);
        int boy_age = sc.nextInt();
        System.out.println("Boy Age is : "+boy_age);

        System.out.println("Enter the Girl Age: ");
        int girl_age = sc.nextInt();
        System.out.println("Girl Age is : "+girl_age);

        System.out.println("Boy is: "+boy_age +" Older and"+"Girl is: "+girl_age+" Years Older!");

        if(boy_age < 21 && girl_age < 18){
            System.out.println("Not Able to Marrry");
        }
        else if(boy_age > 21 && girl_age < 18){
            System.out.println("Girl age is Less");
        }
        else if(boy_age < 21 && girl_age > 18){
            System.out.println("Boy Age is less");
        }
        else{
            System.out.println("Congrajulation Happy Marrage life");
        }

    }
}
