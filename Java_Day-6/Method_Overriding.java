class Animal{
    
    void speak(){
        System.out.println("The Animal Speak");
    }
}

class Dog extends Animal{

    void speak(){
        System.out.println("The Animal bark");
    }
}
///speak---------> over-riding

public class Method_Overriding {
    public static void main(String[] args) {
        
        Animal ani = new Animal();
        Dog dog = new Dog();
        ani.speak();
        dog.speak();
/*
The Animal Speak
The Animal bark
 */
    }
}
