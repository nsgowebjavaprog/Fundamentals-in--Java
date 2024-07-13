class Friend{
    String name;
    static int number_of_friends;

    Friend(String name){
        this.name = name;
        number_of_friends++;
    }
    static void display_friend(){
        System.out.println("You Have: "+number_of_friends+ " Friends");
        // You Have: 2 Friends
    }
}

public class Static_key {
    public static void main(String[] args) {
        
        Friend f1 = new Friend("NSLONI");
        Friend f2 = new Friend("SNLONI");

        //System.out.println(Friend.number_of_friends);
        // 2;
        Friend.display_friend();
    }
}
