public class Pass_Class_to_Fucn {

    public static void fun(int x){
        System.out.println(x);
        return; // Return the value of x
    }

    public static void main(String[] args) {
        int x = 10;
        fun(x+10);   // 20
    }
}