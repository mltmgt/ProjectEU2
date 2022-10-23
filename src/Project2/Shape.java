package Project2;

public interface Shape {
    void calculateArea();

    void calculatePerimeter();
}

class Circle implements Shape {
    double radius = 5;

    @Override
    public void calculateArea() {
        System.out.println("Area of the circle (radius = 5): " + radius * radius * Math.PI);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the circle (radius = 5): " + Math.PI * 2 * radius);
    }
}

class Square implements Shape {
    int edge = 3;

    @Override
    public void calculateArea() {
        System.out.println("Area of the square (edge = 3) : " + edge * edge);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of the square (edge = 3) : " + 4 * edge);
    }
}

class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};
        for (Shape shape : shapes) {
            shape.calculateArea();
            shape.calculatePerimeter();
            System.out.println("**");
        }
    }
}
