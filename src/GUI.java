import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI() {
        setTitle("Tło z Obrazem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        ImageIcon water = new ImageIcon("ocean.jpg");

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(water.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Ustawienie layoutu dla panelu (jeśli potrzebne)
        panel.setLayout(new BorderLayout());

        // Dodanie panelu do okna
        setContentPane(panel);

        // Wyśrodkowanie okna na ekranie
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GUI app = new GUI();
            app.setVisible(true);
        });
    }
}
