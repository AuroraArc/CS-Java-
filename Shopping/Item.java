/*
Design and code an online shopping cart simulation.
Items in the shopping cart should have a name, vendor, cost, and rating.
The shopping cart should support adding items, removing items, displaying the contents with all the item details,
reporting the total cost, reporting the most expensive item, and reporting the number of items that have some property of your choosing.
Write a main method class that tests all public methods.
*/

public class Item {
   private String name;
   private String vendor;
   private double cost;
   private double rating;
   
   public Item(String name, String vendor, double cost, double rating) {
      this.name = name;
      this.vendor = vendor;
      this.cost = cost;
      this.rating = rating;
   }
   
   public String getName() {
      return name;
   }
   
   public String getVendor() {
      return vendor;
   }
   
   public double getCost() {
      return cost;
   }
   
   public double getRating() {
      return rating;
   }
   
   public String toString() { //display contents
      String s = "";
      s += "Name: " + name + ", ";
      s += "Vendor: " + vendor + ", ";
      s += "Cost: " + cost + ", ";
      s += "Rating: " + rating;
      return s;
   }
   
}