public class Buffon {
    public static double NeedleDrop(int drops) {
        int numDrops = 0;
        int numHits = 0;
        for (int i = 0; i < drops; i++) {
            double yLow = Math.random() * 2;
            double angle = Math.random() * Math.PI;
            double yTop = yLow + Math.sin(angle);
            if (yTop > 2) {
                numHits++;
            }
            numDrops++;
        }
        return numDrops / (double)numHits;
    }

    public static void main(String[] args) {
        System.out.println(NeedleDrop(100));
        System.out.println(NeedleDrop(1000));
        System.out.println(NeedleDrop(10000));
        System.out.println(NeedleDrop(100000));
        System.out.println(NeedleDrop(1000000));
        System.out.println(NeedleDrop(10000000));
    }
}
