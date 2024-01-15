import javax.swing.*;

public class RedFish extends Fish{
    public RedFish()
    {
        ImageIcon fish_photo = new ImageIcon("png/fish.png");
        setRightImage(fish_photo);
        ImageIcon fish_photo_left = new ImageIcon("png/fish_left.png");
        setLeftImage(fish_photo_left);
    }
}
