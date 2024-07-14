interface Animal {
    void walk();
}

class Horse implements Animal{
    public void walk(){
        System.out.println("Hell0 Inter--------Face");
    }
}

public class Inter_Face {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();    //Hell0 Inter--------Face
    }
}
