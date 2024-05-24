abstract class Shape {
    abstract void draw();

    abstract void erase();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }

    void erase() {
        System.out.println("Erasing a circle.");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a triangle.");
    }

    void erase() {
        System.out.println("Erasing a triangle.");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square.");
    }

    void erase() {
        System.out.println("Erasing a square.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        System.out.println("Prafull kumar ");
        System.out.println("MCA-C ");
        Shape[] shapes = new Shape[] { new Circle(), new Triangle(), new Square() };
        for (Shape shape : shapes) {
            shape.draw();
            shape.erase();
        }
    }
}