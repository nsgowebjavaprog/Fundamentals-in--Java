import java.util.Random;

public class Dice_Roller {
    //global

    Random random;
    int number;

    Dice_Roller(){
        //Local of 2 line
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(1000000)+1;//by default 1
        System.out.println(number);
    }
}
