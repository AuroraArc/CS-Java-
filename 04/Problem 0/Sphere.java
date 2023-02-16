public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurfaceAreaSp() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }

    public double getVolumeSp() {
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
