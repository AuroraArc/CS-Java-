
public class UnitTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Bob", 100);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.raiseSalary(12);
        System.out.println(employee.getSalary());

        System.out.println();

        Car car = new Car(12, 30);
        System.out.println(car.getFuelAmount());
        System.out.println(car.getFuelEfficiency());
        car.addFuel(20);
        System.out.println(car.getFuelAmount());
        car.drive(132);
        System.out.println(car.getFuelAmount());

        System.out.println();

        Library library = new Library(1000, 0);
        System.out.println(library.getNumBooks());
        System.out.println(library.getCheckout());
        library.takeBook(7);
        System.out.println(library.getCheckout());
        System.out.println(library.getNumBooks());
    }
}
