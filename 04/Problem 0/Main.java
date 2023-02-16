import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        final DecimalFormat df = new DecimalFormat("0.00");

        RectangularPrism rp = new RectangularPrism(10, 20, 5);
        double saRect = rp.getSurfaceAreaRt();
        double volRect = rp.getVolumeRt();
        System.out.println(df.format(saRect));
        System.out.println(df.format(volRect));

        Cylinder cy = new Cylinder(10, 3);
        double saCyl = cy.getSurfaceAreaCy();
        double volCyl = cy.getVolumeCy();
        System.out.println(df.format(saCyl));
        System.out.println(df.format(volCyl));

        Sphere sp = new Sphere(7);
        double saSp = sp.getSurfaceAreaSp();
        double volSp = sp.getVolumeSp();
        System.out.println(df.format(saSp));
        System.out.println(df.format(volSp));
    }
}

