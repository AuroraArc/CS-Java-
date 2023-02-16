public class Counter {

   // instance variables; state
   private int counter; // number instance variables are 0 by default
   private int incrementBy;
   
   
   // constructors; methods that instantiate objects of the class
   public Counter(int incrementBy) {
      this.incrementBy = incrementBy;
   }
   
   // accessors; return piece of data from object's state
   public int getCount() {
      return counter; // public method encapsulates the instance variable
   }
   
   // other methods needed to do what the class should do (like mutators)
   public void count() {
      counter = counter + incrementBy; // public method encapsulates the instance variable
   }
   
}