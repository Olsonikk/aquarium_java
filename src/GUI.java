import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    InsideContainer fishContainer;
    public void makeFish()
    {
        fishContainer.newFish(new Fish());
    }

    public GUI() {
        setTitle("Tło z Obrazem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        fishContainer = new InsideContainer();
        fishContainer.setLayout(new BorderLayout());

        fishContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        Button FishButton = new Button("Button");
        fishContainer.add(FishButton);
        fishContainer.setBackground(Color.cyan);




        FishButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makeFish();
            }
        });


        // Dodanie panelu do okna
        setContentPane(fishContainer);

        // Wyśrodkowanie okna na ekranie
        setLocationRelativeTo(null);

        setVisible(true);
        
    }
}

