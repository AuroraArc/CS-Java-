public class QuestionB {
   public static void main(String[] args) {
      String phrase = "Hello, World!";
      String phrase2 = phrase.replace("e", "p");
      phrase2 = phrase2.replace("o", "e");
      phrase2 = phrase2.replace("p", "o");
      System.out.println(phrase);
      System.out.println(phrase2);
   }
}