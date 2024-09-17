package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        System.out.println(GeometryUtils.convertToMeters(4.655) + " sm");
        System.out.println(GeometryUtils.compareAreas(24.543, 22.441));

        Cube cube=new Cube(3.64);
        System.out.println("Площадь куба: "+ cube.square()+" cm");

        Sphere sphere=new Sphere(4.78);
        System.out.println("Площадь сферы: "+ sphere.square()+" квадратных сантиметра");

    }
}