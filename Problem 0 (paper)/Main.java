public class Main {
    public static void main(String[] args) {
        Employee worker = new Employee("Daniel", 100);
        System.out.println(worker.getName());
        System.out.println(worker.getSalary());
        worker.raiseSalary(27);
        System.out.println(worker.getSalary());
    }
}
