import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = "";

        do{
            System.out.println("Enter the Name: ");
            name = sc.nextLine();
        }while (name.isBlank());
        System.out.println("Hello! "+name);
    }
}
