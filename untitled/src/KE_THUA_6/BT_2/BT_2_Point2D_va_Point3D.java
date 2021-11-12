package KE_THUA_6.BT_2;

public class BT_2_Point2D_va_Point3D {
    private float x = 0.0f;
    private float y = 0.0f;

    public BT_2_Point2D_va_Point3D() {
    }

    public BT_2_Point2D_va_Point3D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    void getXY(float x, float y) {
        float[] xy = {this.x, this.y};
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "BT_2_Point2D_va_Point3D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
