package KE_Thua_6.Thuchanh.BT1;

public class BT_1_Cricle_va_Cylinder {
   private double radius;
   private String color;

    public BT_1_Cricle_va_Cylinder() {};

    public BT_1_Cricle_va_Cylinder(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double  getDienTich () {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "BT_1_Cricle_va_Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
