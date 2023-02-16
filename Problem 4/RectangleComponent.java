import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle box = new Rectangle(10, 10, 100, 200);
        g2.draw(box);
        box.translate(100, 0);
        g2.draw(box);
        box.translate(0, 200);
        g2.draw(box);
        box.translate(-100, 0);
        g2.draw(box);
    }

}
