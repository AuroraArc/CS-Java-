import javax.swing.*;
import java.awt.*;

public class Spiral extends JComponent {
    public void paintComponent(Graphics g) {
        int w = 350;
        int h = 500;
        int wSpiral = w / 2;
        int hSpiral = h / 2;

        for (int i = 0; i < 5; i++) {
            int dist = 30;
            g.drawLine(wSpiral - dist - (dist * i), hSpiral - dist - (dist * i), wSpiral + dist + (dist * i), hSpiral - dist - (dist * i));
            g.drawLine(wSpiral - dist - (dist * i), hSpiral + dist + (dist * i), wSpiral - dist - (dist * i), hSpiral - dist - (dist * i));
            g.drawLine(wSpiral + (dist * i), hSpiral + dist + (dist * i), wSpiral - dist - (dist * i), hSpiral + dist + (dist * i));
            g.drawLine(wSpiral + (dist * i), hSpiral - (dist * i), wSpiral + (dist * i), hSpiral + dist + (dist * i));
        }
    }

    public static void main(String [] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Spiral box = new Spiral();
        frame.add(box);
        frame.setVisible(true);
    }
}
