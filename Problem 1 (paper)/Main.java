public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 1000);
        Manager manager = new Manager("Joe", 2000, "sales");
        Executive executive = new Executive("Billy", 12000, "management");

        System.out.println(employee);
        System.out.println(manager);
        System.out.println(executive);
    }
}
