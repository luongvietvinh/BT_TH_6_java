package KE_THUA_6.BT_2;

public class Point_3D extends BT_2_Point2D_va_Point3D{
    private float z;

    public Point_3D() {
    }

    public Point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.getZ()};
    }

    @Override
    public String toString(){
        return "X :"+this.getX()+" Y "+this.getY()+" Z "+this.getZ();
    }
}
