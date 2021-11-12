package KE_THUA_6.BT_3;

public class BT_3_Point_va_MoveablePoint {
    private float x;
    private float y;

    public BT_3_Point_va_MoveablePoint() {
    }

    public BT_3_Point_va_MoveablePoint(float x, float y) {
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

    public void setXY(float x, float y) {
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY() {
        float[] XY = {this.getX(),this.getY()};
        return XY;
    }

    @Override
    public String toString() {
        return "X :"+this.getX()+" Y "+this.getY();
    }
}
