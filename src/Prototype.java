public class Prototype {
}
interface Shape extends Cloneable {
    Shape cloneShape();
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle cloneShape() {
        return new Circle(this.radius); // deep copy
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public Square cloneShape() {
        return new Square(this.side); // deep copy
    }

    @Override
    public String toString() {
        return "Square with side " + side;
    }
}
