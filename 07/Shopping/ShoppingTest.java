import java.util.ArrayList;

public class ShoppingTest {
   public static void main(String[] chicken) {
      ShoppingCart itemList = new ShoppingCart();
      
      itemList.addItem("Eggs", "Kroger", 2.99, 5);
      itemList.addItem("Milk", "Target", 1.89, 4.7);
      itemList.addItem("Cheese", "Target", 12.39, 2.1);
      itemList.addItem("Bacon", "Walmart", 7.89, 4.3);
      itemList.addItem("Bread", "Kroger", 1.49, 4.8);
      itemList.addItem("Bread", "Kroger", 1.49, 4.8);
      
      itemList.removeItem("Bread");
      
      System.out.println(itemList);
      //System.out.println(itemList.toString());
      System.out.println("Total: " + itemList.totalCost());
      System.out.println("Most Expensive: " + itemList.maxCost());
      System.out.println("# of Highly Rated: " + itemList.ratingFourUp());
      
   }
}