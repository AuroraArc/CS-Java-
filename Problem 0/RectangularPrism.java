public class RectangularPrism {
    private double length;
    private double width;
    private double height;

    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceAreaRt() {
        double surfaceArea = (2 * length * width) + (2 * length * height) + (2 * height * width);
        return surfaceArea;
    }

    public double getVolumeRt() {
        double volume = length * width * height;
        return volume;
    }
}

