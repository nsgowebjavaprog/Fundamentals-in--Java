import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        String symbol = "";

        System.out.println("Enter the ROW: ");
        row = scanner.nextInt();

        System.out.println("Enter the Column's: ");
        col = scanner.nextInt();

        System.out.println("Enter the Symbol: ");
        symbol = scanner.next();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
/*

Enter the ROW: 
2
Enter the Column's:
3
Enter the Symbol:
*
***
***

 */