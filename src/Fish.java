import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Fish extends JFrame{
    //y = 470 is a bottom edge
    private int x,y;

    private int action;
    //random boundary for each fish
    private final int randomMinTop = ThreadLocalRandom.current().nextInt(0, 200);
    private final int randomMaxBottom = ThreadLocalRandom.current().nextInt(250, 480);
    private final int randomMinLeft = ThreadLocalRandom.current().nextInt(0, 300);
    private final int randomMaxRight = ThreadLocalRandom.current().nextInt(350, 680);

    ImageIcon leftImage;
    ImageIcon rightImage;

    //sets random location of a fish
    private void randomStartPosition(){
        x = ThreadLocalRandom.current().nextInt(randomMinLeft, randomMaxRight);
        y = ThreadLocalRandom.current().nextInt(randomMinTop, randomMaxBottom);

        this.setLocation(x, y);
    }

    private void moveUp()
    {
        if (randomMinTop < y) {
            y -= 1;
            this.setLocation(x, y);
        }
        else {
            action=1;
            //System.out.println("Too high!");
        }
    }
    private void moveDown()
    {
        if (randomMaxBottom > y) {
            y += 1;
            this.setLocation(x, y);
        }
        else {
            action = 0;
            //System.out.println("Too low!");
        }
    }

    private void moveLeft()
    {
        if (randomMinLeft < x) {
            x -= 1;
            this.setLocation(x, y);
        }
        else {
            action = 3;
            //System.out.println("Too much to the left!");
        }
    }
    private void moveRight()
    {
        if (randomMaxRight > x) {
            x += 1;
            this.setLocation(x, y);
        }
        else {
            action = 2;
            //System.out.println("Too much to the right!");
        }
    }
    private void newAction()
    {
        this.action = ThreadLocalRandom.current().nextInt(0, 4);
    }
    public int getAction()
    {
        return action;
    }
    public void move(int a)
    {
        if(a==1)
        {
            newAction();
        }

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
        }
        else if (action == 3)
        {
            moveRight();
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
        //printing on the console the boundaries of each fish
        //System.out.println("Min Y: " + randomMinTop);
        //System.out.println("Max Y: " + randomMaxBottom);
        //System.out.println("Min X: " + randomMinLeft);
        //System.out.println("Max X: " + randomMaxRight);
    }

}
