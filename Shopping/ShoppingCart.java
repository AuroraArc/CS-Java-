/*
Design and code an online shopping cart simulation.
Items in the shopping cart should have a name, vendor, cost, and rating.
The shopping cart should support adding items, removing items, displaying the contents with all the item details,
reporting the total cost, reporting the most expensive item, and reporting the number of items that have some property of your choosing.
Write a main method class that tests all public methods.
*/

import java.util.ArrayList;

public class ShoppingCart {
   private ArrayList<Item> items;
   
   public ShoppingCart() {
      items = new ArrayList<Item>();
   }
   
   public void addItem(String name, String vendor, double cost, double rating) {
      items.add(new Item(name, vendor, cost, rating));
   }
   
   /**
      Removes an item from the shopping cart.
      @param name The name of the items to remove.
   */
   public void removeItem(String name) {
      for (int i = 0; i < items.size(); i++) {
         if (items.get(i).getName().equals(name)) {
            items.remove(i);
            i--;
         }
      }
   }
   
   /**
      Returns a string representation of the shopping cart and its items.
      @return The string representation.
   */
   public String toString() {
      String s = "Shopping List" + "\n";
      for (int i = 0; i < items.size(); i++) {
         s += items.get(i).toString() + "\n";
      }   
      return s;
   }
   
   public double totalCost() {
      double sum = 0;
      double cost = 0;
      for (int i = 0; i < items.size(); i++) {
         cost = items.get(i).getCost();
         sum += cost;
      }
      return sum;
   }
   
   public double averageCost() {
      return totalCost()/items.size();
   }
   
   public Item maxCost() {
      double max = items.get(0).getCost();
      Item maxItem = items.get(0);
      for (int i = 1; i < items.size(); i++) {
         if (items.get(i).getCost() > max) {
            max = items.get(i).getCost();
            maxItem = items.get(i);
         }
      }
      return maxItem;
   }
   
   /*public double maxCost() {
      double max = items.get(0).getCost();
      for (int i = 0; i < items.size(); i++) {
         if (items.get(i).getCost() > max) {
            max = items.get(i).getCost();
         }
      }
      return max;
   }*/

   public int ratingFourUp() {
      int count = 0;
      for (int i = 0 ; i < items.size(); i++) {
         if (items.get(i).getRating() > 4.0) {
            count++;
         }
      }
      return count;
   }
   
   public Item findFirstByVendor(String vendor) {
      for (Item item : items) {
         if (vendor.equals(item.getVendor())) return item;
      }
      return null;
   }
   
   public String getItemNames(String c) {
      String s = "";
      for (int i = 0; i < items.size() - 1; i++) {
         s += items.get(i).getName() + c;
      }
      return s;
   }
   
}
   