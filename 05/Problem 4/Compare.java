import java.util.Scanner;
import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String a = input.nextLine();
        System.out.print("Enter string: ");
        String b = input.nextLine();
        System.out.print("Enter string: ");
        String c = input.nextLine();

        String[] arr = {a, b, c};

        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x].compareToIgnoreCase(arr[y]) > 0) {
                    String alphaSort = arr[x];
                    arr[x] = arr[y];
                    arr[y] = alphaSort;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

        /*
        char sortA = a.charAt(0);
        char sortB = b.charAt(0);
        char sortC = c.charAt(0);

        int asciiA = sortA;
        System.out.println(asciiA);

        int asciiB = sortB;
        System.out.println(asciiB);

        int asciiC = sortC;
        System.out.println(asciiC);
         */

}
