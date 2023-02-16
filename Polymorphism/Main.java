public class Main {
   public static void main(String[] args) {
      // How do you assign subclass type object reference to superclass type variable?
      // just make the assignment and no cast is required
      Employee e1 = new Employee("Bob", 1000); //object inherits superclass
      Employee e2 = new Manager("Joe", 2000, "sales");
      Employee e3 = new Executive("Billy", 2500, "sales");
      
      //variable type determines whether you can call method
      
      System.out.println(e1.toString());
      System.out.println(e2.toString());
      System.out.println(e3.toString()); //object type determines which version of method is called
      
      Manager m1 = (Manager)e2;
      Executive ex1 = (Executive)e3; //cast superclass to subclass type
      
      System.out.println(m1.toString());
      System.out.println(ex1.toString()); //the subclass toString version is used, but the superclass determines whether the method can be called
      
      Executive ex2 = new Executive("A", 3000, "sales");
      Executive ex3 = new Executive("B", 1230, "management");
      
      System.out.println(ex2.equals(ex3)); // Object class does not define the method(s) that have to be called in the equals method
   }
}
