public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        String s = "";
        s += super.toString();
        s += "Department: " + department + "\n";
        return s;
    }
}
