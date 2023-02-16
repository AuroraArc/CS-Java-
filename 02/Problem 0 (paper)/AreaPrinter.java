import java.awt.Rectangle;

public class AreaPrinter {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        double width = box.getWidth();
        double height = box.getHeight();
        System.out.println(box);
        System.out.println(width * height);
    }
}
