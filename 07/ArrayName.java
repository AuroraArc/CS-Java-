import java.util.Scanner;
import java.util.Arrays;

public class ArrayName {
   public static void first() {
      String[] names = {"Bob", "Dave", "Sally", "Henry"};
      for (int i = 0; i < names.length; i++) {
         System.out.println(names[i]);
      }
   }
   
   public static void second() {
      String[] names = {"Bob", "Dave", "Sally", "Henry"};
      String name = names[(int)(Math.random() * names.length)];
      System.out.println(name);
      }

   public static void third() {
      Scanner in = new Scanner(System.in);
      
      String[] names = {"Bob", "Dave", "Sally", "Henry"};
      
      boolean done = false;
      while (!done) {
         String name = names[(int)(Math.random() * names.length)];
         System.out.println(name);
         System.out.println("Do you want to continue (Y or N)?");
         if (!in.nextLine().equalsIgnoreCase("Y")) done = true;
      }
   }
   
   public static void fourth() {
      String[] userNames = new String[6];
      Scanner in = new Scanner(System.in);
      for (int i = 0; i < 6; i++) {
         System.out.println("Please enter a name:");
         userNames[i] = in.nextLine();
      }
      
      boolean done = false;
      while (!done) {
         String name = userNames[(int)(Math.random() * userNames.length)];
         System.out.println(name);
         System.out.println("Do you want to continue (Y or N)?");
         if (!in.nextLine().equalsIgnoreCase("Y")) done = true;
      }
   }
   
   public static void fifth() {
      String[] names = {};
      Scanner in = new Scanner(System.in);
      boolean doneInit = false;
      int i = 0;
      while (!doneInit) {
         i++;
         System.out.println("Please enter a name:");
         String input = in.nextLine();
         if (input.equals("D")) {
            doneInit = true;
            break;
         }
         names = Arrays.copyOf(names, i);
         names[i - 1] = input;
      }
      
      boolean done = false;
      while (!done) {
         String name = names[(int)(Math.random() * names.length)];
         System.out.println(name);
         System.out.println("Do you want to continue (Y or N)?");
         if (!in.nextLine().equalsIgnoreCase("Y")) done = true;
      }
   }
         

   public static void main(String[] args) {
      first();
      second();
      third();
      fourth();
      fifth();
   }
}  