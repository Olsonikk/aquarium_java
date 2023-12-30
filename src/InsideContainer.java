import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;


public class InsideContainer extends JPanel
{
    int action;
    Fish fish_object = new Fish();
    public ImageIcon water;
    public ImageIcon fish_picture;
    public ImageIcon fish_picture_left;

    InsideContainer(){
        water = new ImageIcon("ocean.jpg");
        fish_picture = fish_object.fish_photo;
        fish_picture_left = fish_object.fish_photo_left;
        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action = ThreadLocalRandom.current().nextInt(0, 4);
//                System.out.println(action);
//                System.out.println("X: " + fish_object.getX());
//                System.out.println("Y: " + fish_object.getY());
                //switch(action){
                    //case 0:
                        //fish_object.moveUp();
                    //case 1:
                        //fish_object.moveDown();
                //}
                if(action == 0)
                {
                    fish_object.moveUp();
                }
                else if(action == 1)
                {
                    fish_object.moveDown();
                }
                else if(action == 2)
                {
                    fish_object.moveLeft();
                }
                else if (action == 3) {
                    fish_object.moveRight();
                }
                repaint();
            }
        });
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(water.getImage(), 0, 0, 800, 600, this);
        if(action == 2)
        {
            g.drawImage(fish_picture_left.getImage(), fish_object.getX(), fish_object.getY(), 150, 100, this);
        }
        else
        {
            g.drawImage(fish_picture.getImage(), fish_object.getX(), fish_object.getY(), 150, 100, this);
        }

    }
    
}