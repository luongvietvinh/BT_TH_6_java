package Abctract_Interface.TH_2;

public class Circle {
    double radius;
    String color;
    boolean fielled;

    public Circle(double radius) {
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

    public boolean isFielled() {
        return fielled;
    }

    public void setFielled(boolean fielled) {
        this.fielled = fielled;
    }

    public Circle(double radius, String color, boolean fielled) {
        this.radius = radius;
        this.color = color;
        this.fielled = fielled;
    }

    public Circle() {
    }

}
