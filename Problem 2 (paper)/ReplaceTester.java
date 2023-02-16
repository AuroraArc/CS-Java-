public class ReplaceTester {
    public static void main(String[] args) {
        String phrase = "Mississippi";
        phrase = phrase.replace("i", "!");
        phrase = phrase.replace("s", "$");
        System.out.println(phrase);
    }
}
