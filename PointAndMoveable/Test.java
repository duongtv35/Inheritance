package Inheritance.PointAndMoveable;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(1,1);
        System.out.println(movablePoint);
        movablePoint.MovablePoint();
        System.out.println(movablePoint);
    }

}
