package Clean_Code.TH_3;

public class Cylinder {
    private double radius;
    public  float height;
    public static  double getVolume (double radius, float height) {
            double baseArea = getBaseArea(radius);
            double primeter = getPrimeter(radius);
            double volume = primeter * height + 2 * baseArea;
            return volume;
    }
    private static double getBaseArea (double radius){
        return Math.PI * radius * radius;
    }
    private  static double getPrimeter (double radius) {
        return 2 * Math.PI *radius;
    }
}
