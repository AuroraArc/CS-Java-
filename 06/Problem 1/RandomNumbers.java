import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RandomNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        List<Integer> numberList = new ArrayList<Integer>();
        while (i <= 100000) {
            int j = (int)(Math.floor(Math.random() * 1000 + 1));
            numberList.add(j);
            sum = sum + j;
            i++;
        }
        System.out.println(sum / 100000.0);
        System.out.println(Collections.min(numberList));
        System.out.println(Collections.max(numberList));
        System.out.println(Collections.max(numberList) - Collections.min(numberList));
    }
}