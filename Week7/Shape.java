public abstract class Shape {

    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "";
        this.filled = false;
    }
    public Shape(String color) {
     this.color = color;
    }

    // abstract method
    // khong co phan body
    // chi co phan tieu de
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFill(boolean filled) {
        this.filled = filled;
    }
}
