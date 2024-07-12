import java.util.*;

public class Logical_Opn {
    public static void main(String[] args) {
        
        // &&, !, ||

        Scanner sc= new Scanner(System.in);

        System.out.println("You are Now Playing a game! if you Go out Then Preess 0 {or} 1 ");
        String press = sc.next();

        if(press.equals("0") || press.equals("1")){
            System.out.println("You QUiT the Game!");
        }
        else{
            System.out.println("Still Playing a Game");
        }

        /*        if(!press.equals("0") && !press.equals("1")){
            System.out.println("You QUiT the Game!");
        }
        else{
            System.out.println("Still Playing a Game");
        }
             */


    }
}
