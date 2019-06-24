package Inheritance.Class_Shape;

public class Retangle_test {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        System.out.println(retangle);
        retangle = new Retangle(4,5);
        System.out.println(retangle);
        retangle = new Retangle("orange",false,10,5);
        System.out.println(retangle);
    }

}
