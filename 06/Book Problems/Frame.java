import javax.swing.JFrame;

public class Frame {
public static void main(String [] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Checkerboard box = new Checkerboard();
        frame.add(box);

        frame.setVisible(true);
    }
}

