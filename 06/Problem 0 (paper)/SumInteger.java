import java.util.Scanner;

public class SumInteger {

   public static void main(String[] args) {

      int sum = 0;
      int i = 0;


      for (i = 0; i <= 100; i += 2) {
         sum = sum + i;
      }
      System.out.println(sum);
      sum = 0;

      for (i = 0; i <= 100; i += 1) {
         if (i == Math.pow((int)Math.sqrt(i), 2)) {
            sum = sum + i;
         }
      }
      System.out.println(sum);
      sum = 0;

      for (i = 0; i <= 20; i += 1) {
         sum = sum + (int)Math.pow(2, i);
      }
      System.out.println(sum);
      sum = 0;

      Scanner input = new Scanner(System.in);
      System.out.print("Set i value: ");
      i = input.nextInt();
      System.out.print("Set j value: ");
      int j = input.nextInt();

      while (i <= j) {
         if (i % 2 == 1) {
            sum = sum + i;
            i++;
         }
         i++;
      }
      System.out.println(sum);
      sum = 0;

      System.out.print("Set i value: ");
      i = input.nextInt();


   }
}
