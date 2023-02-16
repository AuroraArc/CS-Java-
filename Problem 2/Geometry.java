import java.text.DecimalFormat;

public class Geometry {

    public static double getSurfaceAreaRt(double lengthRt, double widthRt, double heightRt) {
        double surfaceArea = (2 * lengthRt * widthRt) + (2 * lengthRt * heightRt) + (2 * heightRt * widthRt);
        return surfaceArea;
    }

    public static double getVolumeRt(double lengthRt, double widthRt, double heightRt) {
        double volume = lengthRt * widthRt * heightRt;
        return volume;
    }

    public static double getSurfaceAreaCy(double radiusCy, double heightCy) {
        double surfaceArea = (2 * Math.PI * Math.pow(radiusCy, 2)) + (2 * Math.PI * radiusCy) * heightCy;
        return surfaceArea;
    }

    public static double getVolumeCy(double radiusCy, double heightCy) {
        double volume = (2 * Math.PI * radiusCy) * heightCy;
        return volume;
    }

    public static double getSurfaceAreaSp(double radiusSp) {
        double surfaceArea = 4 * Math.PI * Math.pow(radiusSp, 2);
        return surfaceArea;
    }

    public static double getVolumeSp(double radiusSp) {
        double volume = 4.0 / 3.0 * Math.PI * Math.pow(radiusSp, 3);
        return volume;
        // return 4 * Math.PI * Math.pow(radiusSp, 3) / 3;
    }

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(getSurfaceAreaRt(12, 2, 5));
        System.out.println(getVolumeRt(12, 2, 5));
        System.out.println(df.format(getSurfaceAreaCy(2, 8)));
        System.out.println(df.format(getVolumeCy(2, 8)));
        System.out.println(df.format(getSurfaceAreaSp(4)));
        System.out.println(df.format(getVolumeSp(4)));
    }
}
