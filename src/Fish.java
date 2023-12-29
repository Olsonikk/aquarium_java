import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;



public class Fish extends JFrame{
    ImageIcon fish_photo = new ImageIcon("fish2.png");

    // private int randomStartPosition;
    // private int randomMovementArea;
    // private int randomMinLeft;
    // private int randomMaxRight;
    // private int randomMinTop;
    // private int randomMaxBottom;

    // private void randomMinLeft() {
		// this.minLeft = Math.random() * 10; //gives value from 0 to 10
	// }

    // static void moveUp(){

    // }
    // static void MoveDown(){

    // }
    // static void MoveLeft(){

    // }
    // static void MoveRight(){
    // }
    public void randomStartPosition(){
        int start_x = ThreadLocalRandom.current().nextInt(100, 700 + 1);
        int start_y = ThreadLocalRandom.current().nextInt(100, 500 + 1);
        //int start_x = 500;
        //int start_y = 200;
        //int start_x = Math.random() * (1200 - 100) + 100;
        //int start_y = Math.random() * (800 - 100) + 100;
        System.out.println(start_x);
        System.out.println(start_y);
        this.setLocation(start_x, start_y);

    }


    public Fish() {
        randomStartPosition();

    }

}