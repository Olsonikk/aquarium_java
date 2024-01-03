import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class InsideContainer extends JPanel
{
    int action, previous_direction;
    public ImageIcon water;

    ArrayList<Fish> names = new ArrayList<>();

    public void newFish(Fish f)
    {
        names.add(f);
    }

    InsideContainer(){
        water = new ImageIcon("png/ocean.jpg");
        Timer timer = new Timer(200, e -> {
            for(Fish fisk : names)
            {
                if(action == 2 || action == 3)
                {
                    previous_direction = action;
                }
                fisk.move();
                repaint();
            }

        });
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(water.getImage(), 0, 0, 800, 600, this);

        for(Fish fisk : names)
        {
            action = fisk.getAction();
            if(action == 2 || (previous_direction == 2 && action != 3))
            {
                g.drawImage(fisk.getLeftImage().getImage(), fisk.getX(), fisk.getY(), 120, 80, this);
            }
            else
            {
                g.drawImage(fisk.getRightImage().getImage(), fisk.getX(), fisk.getY(), 120, 80, this);
            }
        }


    }

    
}