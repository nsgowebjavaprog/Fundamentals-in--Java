public class Human {
        String name;
        int age;
        double weight;

        // Constructor
        Human(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        // Method to represent eating
        public void eat() {
            System.out.println(this.name + " Is Still Programmimg");
        }
    
        public void drink() {
            System.out.println(this.name + " Is always Coding");
        }
    }