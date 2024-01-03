import javax.swing.*;

public class BlueFish extends Fish{
    public BlueFish()
    {
        ImageIcon fish_photo = new ImageIcon("png/blue_fish.png");
        setRightImage(fish_photo);
        ImageIcon fish_photo_left = new ImageIcon("png/blue_fish_left.png");
        setLeftImage(fish_photo_left);
    }
}
