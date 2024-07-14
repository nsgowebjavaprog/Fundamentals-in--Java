import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio {
    
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        
        Scanner scanner = new Scanner(System.in);

        File file = new File("in-slow-motion-inspiring-ambient-lounge-219592.mp3");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (response.equals("Q")) {
            System.out.println("P = play, S = stop, R = Reset, Q = Quit");
       
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"):clip.start();
                break;
                case ("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("Q"):clip.close();
                break;
                default:System.out.println("Not Valid Chooooes");
            }
        }

    }
}