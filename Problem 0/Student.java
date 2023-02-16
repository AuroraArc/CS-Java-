public class Student extends Person {
    private String major;
    public Student(String name, double birthYear, String major) {
        super(name, birthYear);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}
