
class Shape {
    protected double area;

    public Shape(double area) {
        this.area = area;
    }

    public void calculateArea() {
        System.out.println("shape: " + area);
    }
}

class Rectangle extends Shape {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        super(length * width);
        this.length = length;
        this.width = width;
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter rectangle: " + 2 * (length + width));
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        super(Math.PI * radius * radius);
        this.radius = radius;
    }

    public void calculateCircumference() {
        System.out.println("circumference the circle: " + 2 * Math.PI * radius);
    }
}

class ThreeDimensionalShape extends Shape {
    protected double volume;

    public ThreeDimensionalShape(double area, double volume) {
        super(area);
        this.volume = volume;
    }

    public void calculateVolume() {
        System.out.println("Vol of shape: " + volume);
    }
}

class Cuboid extends Rectangle {
    protected double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }
}