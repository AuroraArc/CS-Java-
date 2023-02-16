public class Employee {
   private String name;
   private double salary;

   public Employee(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }

   public String getName() {
       return name;
   }

   public double getSalary() {
        return salary;
   }

   public String toString() {
      String s = "";
      s += "Name: " + name + "\n";
      s += "Salary: " + salary + "\n";
        return s;
   }

   public boolean equals(Object obj) {
       if (obj instanceof Employee) {
           Employee employee = (Employee)obj;
           return (getName().equals(employee.getName()) && (getSalary() == employee.getSalary()));
       }
       return false;
   }
}
