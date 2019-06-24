package Inheritance.Class_Shape;

public class Circle_test {
    public static void main(String[] args) {
        Circle circle= new Circle();
        System.out.println(circle);
        circle = new Circle(5);
        System.out.println(circle);

        circle= new Circle("bluewhite",false,5);
        System.out.println(circle);

    }
}
