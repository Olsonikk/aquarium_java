import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        setTitle("Tło z Obrazem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        InsideContainer panel = new InsideContainer();

        // Ustawienie layoutu dla panelu (jeśli potrzebne)
        panel.setLayout(new BorderLayout());

        // Dodanie panelu do okna
        setContentPane(panel);

        // Wyśrodkowanie okna na ekranie
        setLocationRelativeTo(null);

        setVisible(true);
        
    }
}

