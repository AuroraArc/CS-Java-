import javax.swing.*;
import java.awt.*;

public class Checkerboard extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(30, 30, 10, 10);
        Rectangle fillBox = new Rectangle(30, 30, 11, 11);
        int k = 1;
        for (int j = 1; j <= 8; j++) {
            if (k % 2 != 0) {
                for (int i = 1; i <= 4; i++) {
                    g2.draw(box);
                    g2.translate(10, 0);
                    g2.fill(fillBox);
                    g2.translate(10, 0);
                }
            }
            if (k % 2 == 0) {
                for (int i = 1; i <= 4; i++) {
                    g2.fill(fillBox);
                    g2.translate(10, 0);
                    g2.draw(box);
                    g2.translate(10, 0);
                }
            }
            k++;
            g2.translate(-80, 10);
        }
    }
}
