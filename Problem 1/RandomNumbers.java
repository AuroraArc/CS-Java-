import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class RandomNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        //List<Integer> numberList = new ArrayList<Integer>();
        int j = (int)(Math.random() * 1000 + 1);
        int min = j;
        int max = j;
        while (i + 1 < 100000) {
            j = (int)(Math.random() * 1000 + 1);
            //int j = (int)(Math.floor(Math.random() * 1000 + 1));
            //numberList.add(j);
            if (j < min) min = j;
            if (j > max) max = j;
            sum = sum + j;
            i++;
        }
        System.out.println(sum / 100000.0);
        //System.out.println(Collections.min(numberList));
        //System.out.println(Collections.max(numberList));
        //System.out.println(Collections.max(numberList) - Collections.min(numberList));
        System.out.println(min);
        System.out.println(max);
        System.out.println(max - min);
    }
}