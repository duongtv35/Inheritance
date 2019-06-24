package Inheritance.Class_Shape.Class2D_3D;

public class C_2D {
    private float x ;
    private float y ;


    public C_2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public C_2D() {

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
    public void setXY(float x,float y){
        this.x=x;
        this.y=y;

    }
    public float[] getXY(){
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }

    @Override
    public String toString() {
        return "C_2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
