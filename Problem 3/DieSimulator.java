import java.util.Random;

public class DieSimulator {
    public static void main(String[] args) {
        Random die = new Random();
        int num = die.nextInt(6) + 1;
        System.out.println(num);
    }
}
