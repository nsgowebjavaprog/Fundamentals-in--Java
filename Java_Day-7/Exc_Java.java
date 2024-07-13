public class Exc_Java {

    public static void main(String[] args) {
        
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
/*
 * ArithmeticException: / by zero
Finally block executed
 */