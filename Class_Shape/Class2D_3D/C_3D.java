package Inheritance.Class_Shape.Class2D_3D;

public class C_3D extends C_2D {
    private float z;

    public C_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public C_3D(float z) {
        this.z = z;
    }

    public C_3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;


    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = this.getX();
        arr[1] = this.getY();
        arr[2] = this.z;
        return arr;

    }

    @Override
    public String toString() {
        return "C_3D{" + "x" +super.getX()+ "y :" +super.getY()+
                "z=" + z +
                '}';
    }

}
