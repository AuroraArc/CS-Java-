import java.awt.Rectangle;

public class ImgRectangle {
   public static void main(String[] args) {
      Rectangle r1 = new Rectangle(0, 0, 20, 30);
      Rectangle r2 = new Rectangle(10, 10, 30, 50);
      double perimeter = r1.getX() + (r2.getX() + r2.getWidth() + r2.getY() + r2.getHeight()) * 2;
      System.out.println(perimeter);
      r2.add(r1);
      System.out.println(r2.getWidth() * 2 + r2.getHeight() * 2);
   }
}