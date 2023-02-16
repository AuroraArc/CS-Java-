public class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getSurfaceAreaCy() {
        double surfaceArea = (2 * Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius) * height;
        return surfaceArea;
    }

    public double getVolumeCy() {
        double volume = (2 * Math.PI * radius) * height;
        return volume;
    }
}

