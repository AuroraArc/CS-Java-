public class Instructor extends Person {

    private double salary;

    public Instructor(String name, double birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
