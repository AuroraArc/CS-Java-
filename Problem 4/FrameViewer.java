import javax.swing.JFrame;

public class FrameViewer {
    public static void main(String [] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RectangleComponent box = new RectangleComponent();
        frame.add(box);

        frame.setVisible(true);
    }
}
