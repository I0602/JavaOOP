public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

 
    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Annotation (optinal)
    @Override
    public double getArea() {
        return this. length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2.0;
    }

    public String toString() {
        return "Rectangle{" + "length=" + length +
        ", width=" + width +
        ", color=" + color + '}';
    }
}