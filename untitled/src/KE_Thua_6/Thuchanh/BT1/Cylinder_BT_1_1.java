package KE_Thua_6.Thuchanh.BT1;

public class Cylinder_BT_1_1 extends BT_1_Cricle_va_Cylinder {

    private double radius = 5;
    private  double dientich = 6;

    public Cylinder_BT_1_1() {};

    public Cylinder_BT_1_1(double radius) {
        this.radius = radius;
    }

    public Cylinder_BT_1_1(double radius, String color, double radius1) {
        super(radius, color);
        this.radius = radius1;
    }
    public double getTheTich () {
        return this.radius * dientich;
    }

    @Override
    public String toString() {
        return "Cylinder_BT_1_1{" +
                "radius=" + radius +
                '}';
    }
}
