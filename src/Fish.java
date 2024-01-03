import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Fish extends JFrame{
    //y = 470 is a bottom edge
    private int x,y;

    private int action;
    private final int randomMinTop = ThreadLocalRandom.current().nextInt(0, 200);
    private final int randomMaxBottom = ThreadLocalRandom.current().nextInt(250, 480);
    private final int randomMinLeft = ThreadLocalRandom.current().nextInt(0, 300);
    private final int randomMaxRight = ThreadLocalRandom.current().nextInt(350, 680);

    ImageIcon leftImage;
    ImageIcon rightImage;







    private void randomStartPosition(){
        x = ThreadLocalRandom.current().nextInt(randomMinLeft, randomMaxRight);
        y = ThreadLocalRandom.current().nextInt(randomMinTop, randomMaxBottom);
        System.out.println(x);
        System.out.println(y);

        this.setLocation(x, y);
    }

    private void moveUp()
    {
        if (randomMinTop < y) {
            y -= 10;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too high!");
            //y += 40;
        }
    }
    private void moveDown()
    {
        if (randomMaxBottom > y) {
            y += 10;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too low!");
            //y -= 40;
        }
    }

    private void moveLeft()
    {
        if (randomMinLeft < x) {
            x -= 20;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too much to the left!");
            //x += 40;
        }
    }
    private void moveRight()
    {
        if (randomMaxRight > x) {
            x += 10;
            this.setLocation(x, y);
        }
        else {
            System.out.println("Too much to the right!");
            //x -= 40;
        }
    }
    public void newAction()
    {
        this.action = ThreadLocalRandom.current().nextInt(0, 4);
    }
    public int getAction()
    {
        return action;
    }
    public void move()
    {
        newAction();
        if(action == 0)
        {
            moveUp();
        }
        else if(action == 1)
        {
            moveDown();
        }
        else if(action == 2)
        {
            moveLeft();
            //System.out.println("LEFT");
        }
        else if (action == 3)
        {
            moveRight();
            //System.out.println("RIGHT");
        }
    }
    protected void setLeftImage(ImageIcon i)
    {
        leftImage = i;
    }

    protected void setRightImage(ImageIcon i)
    {
        rightImage  = i;
    }

    public ImageIcon getLeftImage()
    {
        return leftImage;
    }
    public ImageIcon getRightImage()
    {
        return rightImage;
    }





    public Fish() {
        randomStartPosition();
        System.out.println("Min Y: " + randomMinTop);
        System.out.println("Max Y: " + randomMaxBottom);
        System.out.println("Min X: " + randomMinLeft);
        System.out.println("Max X: " + randomMaxRight);
    }

}