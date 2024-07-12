import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter the Name: ");
            name = sc.nextLine();
        }
        System.out.println("Hello! "+name);
    }
}
