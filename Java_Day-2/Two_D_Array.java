import java.util.*;

public class Two_D_Array {
    public static void main(String[] args) {
        
        int[][] number = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(number);

        /* 
        int[][] numbers = new int[3][3];

        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        numbers[2][0] = 7;
        numbers[2][1] = 8;
        numbers[2][2] = 9;
        
*/

        for (int i = 0; i < number.length; i++) {
            System.out.println();
            for (int j = 0; j < number.length; j++) {
                System.out.print(number[i][j]+" ");
            }
        }
    
    }
}
/*
      1 2 3
      4 5 6
      7 8 9
 */