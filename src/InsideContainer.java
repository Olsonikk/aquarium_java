import javax.swing.*;
import java.awt.*;

public class InsideContainer extends JPanel
{
    public ImageIcon water;
    public Fish fish1;
    InsideContainer(){
        water = new ImageIcon("C:\\Users\\TEMP.CSPUT\\Desktop\\long-term-project-java-Olsonikk-main\\ocean.jpg");
        ImageIcon fish_photo = new ImageIcon("C:\\Users\\TEMP.CSPUT\\Desktop\\long-term-project-java-Olsonikk-main\\fish2.png");
        // fish = new ImageIcon("C:\\Users\\TEMP.CSPUT\\Desktop\\long-term-project-java-Olsonikk-main\\fish2.png");
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(water.getImage(), 0, 0, 1200, 800, this);

        g.drawImage(fish1.fish_photo.getImage(), fish1.getX(), fish1.getY(), 100, 100, this);

    
    }
    
}