import java.util.Scanner;

public class Sentence {
    private String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getFirstThreeCharacters() {
        String fThreeChar = sentence.substring(0,3);
        return fThreeChar;
    }

    public String getLastThreeCharacters() {
        String lThreeChar = sentence.substring(sentence.length() - 3);
        return lThreeChar;
    }

    public String getAllButFirstThree() {
        String exFThree = sentence.substring(3);
        return exFThree;
    }

    public String getAllButFirstAndLast() {
        String exFL = sentence.substring(1, sentence.length() - 1);
        return exFL;
    }

    public String removeSpaces() {
        String exSp = sentence.replace(" ", "");
        return exSp;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = input.nextLine();

        Sentence sentence1 = new Sentence(sentence);

        System.out.println(sentence1.getFirstThreeCharacters());
        System.out.println(sentence1.getLastThreeCharacters());
        System.out.println(sentence1.getAllButFirstThree());
        System.out.println(sentence1.getAllButFirstAndLast());
        System.out.println(sentence1.removeSpaces());

    }
}
