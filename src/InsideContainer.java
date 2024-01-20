import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class InsideContainer extends JPanel
{
    int action, previous_direction;
    private final ImageIcon water;

    private final ArrayList<Fish> names = new ArrayList<>();

    public void newFish(Fish f)
    {
        names.add(f);
    }

    InsideContainer(){
        water = new ImageIcon("png/ocean.jpg");
        AtomicInteger state= new AtomicInteger(10);
        Timer timer = new Timer(50, e -> { //move every 50ms (adjustable)
            for(Fish fisk : names)
            {
                if(action == 2 || action == 3)
                {
                    previous_direction = action;
                }
                fisk.move(state.get());
                state.set(state.get() - 1);
                fisk.move(state.get());
                repaint();
                if(state.get() == 0)
                {
                    state.set(10);    //change fish behaviour every 10 ticks
                }
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
            //movement conditions
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
