import javax.swing.*;
import java.awt.*;


public class InsideContainer extends JPanel
{
    Fish ryba = new Fish();
    public ImageIcon water;
    public ImageIcon fish_picture;

    InsideContainer(){
        water = new ImageIcon("ocean.jpg");
        fish_picture = ryba.fish_photo;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(water.getImage(), 0, 0, 800, 600, this);

        g.drawImage(fish_picture.getImage(), ryba.getX(), ryba.getY(), 50, 50, this);

    
    }
    
}