package Inheritance.Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return Math.PI*super.getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' +super.toString();
    }
}
