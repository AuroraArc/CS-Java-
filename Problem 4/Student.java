import java.text.DecimalFormat;

public class Student {
    private String name;
    private double total;
    private double avg;

    /**
     * Establishes the characteristics of the student
     * @param name the name of the student
     * @param total the total score amount of quizzes
     * @param avg the average score of the quizzes
     */
    public Student(String name, double total, double avg) {
        this.name = name;
        this.total = total;
        this.avg = avg;
    }

    /**
     * Gets the student's name
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the total score of the student
     * @return total score of the student
     */
    public double getTotalScore() {
        return total;
    }

    /**
     * Gets the average score of the student
     * @return average score of quizzes
     */
    public double getAverageScore() {
        return avg;
    }

    /**
     * Adds a new quiz score into the previous total and calculates the new average
     * @param quiz new quiz score
     */
    public void addQuizScore(double quiz) {
        double total1 = total + quiz;
        avg = (total1) / (total / avg + 1);
        total = total1;
    }

    /**
     * executes the program
     * @param args command-line argument
     */
    public static void main(String[] args) {
        Student student = new Student("Bob", 734, 81.56);

        final DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(student.getName());
        System.out.println(student.getTotalScore());
        System.out.println(student.getAverageScore());
        student.addQuizScore(73);
        System.out.println(student.getTotalScore());
        System.out.println(df.format(student.getAverageScore()));
    }
}
