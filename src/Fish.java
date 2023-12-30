import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Fish extends JFrame{
    private int x,y;
    private final int randomMinTop = ThreadLocalRandom.current().nextInt(100, 300);
    private final int randomMaxBottom = ThreadLocalRandom.current().nextInt(350, 700);
    private final int randomMinLeft = ThreadLocalRandom.current().nextInt(150, 300);
    private final int randomMaxRight = ThreadLocalRandom.current().nextInt(350, 650);

    ImageIcon fish_photo = new ImageIcon("fish.png");
    ImageIcon fish_photo_left = new ImageIcon("fish_left.png");

    public void randomStartPosition(){
        x = ThreadLocalRandom.current().nextInt(150, 650);
        y = (randomMinTop + randomMaxBottom)/2;

        System.out.println(x);
        System.out.println(y);

        this.setLocation(x, y);
    }

    public void moveUp()
    {
        if (randomMinTop < y) {
            y -= 20;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too high!");
        }
    }
    public void moveDown()
    {
        if (randomMaxBottom > y) {
            y += 20;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too low!");
        }
    }

    public void moveLeft()
    {
        if (randomMinLeft < x) {
            x -= 20;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too much to the left!");
        }
    }
    public void moveRight()
    {
        if (randomMaxRight > x) {
            x += 20;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too much to the right!");
        }
    }



    public Fish() {
        randomStartPosition();
        System.out.println("Min Y: " + randomMinTop);
        System.out.println("Max Y: " + randomMaxBottom);
        System.out.println("Min X: " + randomMinLeft);
        System.out.println("Max X: " + randomMaxRight);
    }

}