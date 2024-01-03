import javax.swing.*;

public class YellowFish extends Fish{

    public YellowFish()
    {
        ImageIcon fish_photo = new ImageIcon("png/yellow_fish.png");
        setRightImage(fish_photo);
        ImageIcon fish_photo_left = new ImageIcon("png/yellow_fish_left.png");
        setLeftImage(fish_photo_left);
    }

    //why is it better to make photo in the constructor rather than as private final?
}
