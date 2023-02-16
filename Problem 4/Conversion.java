import java.util.Scanner;
import java.text.DecimalFormat;

public class Conversion {

    private int measurement;
    private int mile;
    private int feet;
    private double inch;

    public Conversion(int measurement) {
        this.measurement = measurement;
    }

    public void measurementConverter() {
        mile = (int)(measurement * 0.0006213712);
        double measurementMileR = measurement % (1 / 0.0006213712);
        feet = (int)(measurementMileR * 3.280839895);
        double measurementFeetR = (measurementMileR * 3.280839895) - Math.floor(measurementMileR * 3.280839895);
        inch = (measurementFeetR * 12);


    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter measurement: ");
    int measurement = input.nextInt();

    final DecimalFormat df = new DecimalFormat("0.00");

    Conversion conversion = new Conversion(measurement);
    conversion.measurementConverter();
    System.out.println(conversion.mile);
    System.out.println(conversion.feet);
    System.out.println(df.format(conversion.inch));
    }
    
    System.out.println(hello);  // Line 1
    System.out.print(world);    // Line 2
}
