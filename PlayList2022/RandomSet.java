import java.util.Arrays;

public class RandomSet {
   //returns an array of random integers (1)
   public static int[] randomNum(int length, int range) {
      int[] numbers = new int[length];
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int)(Math.random() * range) + 1;
      }
      return numbers;
   }
   
   //returns the sum (2)
   public static int getSum(int[] numbers) {
      int sum = 0;
      for (int i : numbers) {
         sum += i;
      }
      return sum;
   }
   
   //find first position of a given parameter (7)
   public static int getFirstPos(int[] numbers, int x) {
      int position = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] == x) {
            position = i;
            break;
         }
      }
      return position;
   }
   
   //returns new array containing integer at a selected position with all subsequent elemtns shifted back (8)
   public static int[] newElementShiftBack(int[] numbers, int x, int position) {
      int moreNumbers[] = new int[numbers.length + 1];
      for (int i = 0; i < numbers.length + 1; i++) {
         if (i < position - 1) {
            moreNumbers[i] = numbers[i];
         }
         else if (i == position - 1) {
            moreNumbers[i] = x;
         }
         else {
            moreNumbers[i] = numbers[i - 1];
         }
      }
      return moreNumbers;
   }
   
   //returns new array containing one less integer at a selected position (9)
   public static int[] removeElement(int[] numbers, int position) {
      int lessNumbers[] = new int[numbers.length - 1];
      for (int i = 0, j = 0; i < numbers.length; i++) {
         if (i == position) {
            continue;
         }
         lessNumbers[j++] = numbers[i];
      }
      return lessNumbers;
   }
   
   //(10)
   public static String intString(int[] numbers, char c) {
      String split = "";
      for (int i = 0; i < numbers.length; i++) {
         int[] newArray = (Arrays.copyOfRange(numbers, i, i + 1));
         split += Arrays.toString(newArray) + c;
      }
      return split;
   }
   
   public static void main(String[] args) {
      int[] array = {0,1,234,5,31,4,124,51,2};
      
      System.out.println(Arrays.toString(newElementShiftBack(array, 21, 3)));
      System.out.println(Arrays.toString(removeElement(array, 3)));
      System.out.println(intString(array, 'w'));
   }
}
      