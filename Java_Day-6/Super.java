class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return this.name + "\n" +this.age + "\n";
    }
}

class Hero extends Person{
    String power;

    Hero(String name, int age, String power){
        super(name,age);
        this.power = power;
    }
    public String toString(){
        return super.toString()+this.power;
    }
}

// Main

public class Super {
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("NSLONI", 20, "Power-1");
        Hero hero2 = new Hero("SNLONI", 20, "Power-2");

        System.out.println(hero2.toString());
        /*
        SNLONI
        20
        Power-2
         */

    }

}
