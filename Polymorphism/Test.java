public class Test {
    public static void main(String[] args) {
        Employee ee = new Executive("a", 100, "sale");
        Manager mm = new Executive("a", 100, "sale");
        Executive ex = new Executive("a", 100, "sale");
        String str = "Hello";

        mm = ex;

    }
}
