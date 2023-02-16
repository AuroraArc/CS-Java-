public class Physics {

   public static final double C = 299792458;

   public static double getEnergy(double mass) {
      return mass * Math.pow(C, 2);
   }