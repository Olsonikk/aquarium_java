import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private int specie;
    InsideContainer fishContainer;
    public void makeFish(Object f)
    {
        fishContainer.newFish((Fish) f);
    }

    public GUI() {
        setTitle("Aquarium");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        fishContainer = new InsideContainer();
        fishContainer.setLayout(new BorderLayout());

        fishContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        Button FishButton = new Button("Add");
        fishContainer.add(FishButton);
        fishContainer.setBackground(Color.cyan);

        //combo box
        String[] fishNames = {"Red Fish", "Yellow Fish", "Blue Fish"};
        JComboBox FishList = new JComboBox(fishNames);
        fishContainer.add(FishList);
    
        FishList.addActionListener(e -> {
            specie = FishList.getSelectedIndex(); //index of the specie in the combo box
            //System.out.println(FishList.getSelectedIndex());
        });
        //button
        FishButton.addActionListener(e -> {
            if(specie == 0)
            {
                makeFish(new RedFish());
            }
            else if(specie == 1)
            {
                makeFish(new YellowFish());
            }
            else if (specie == 2)
            {
                makeFish(new BlueFish());
            }
        });

        setContentPane(fishContainer);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
}

