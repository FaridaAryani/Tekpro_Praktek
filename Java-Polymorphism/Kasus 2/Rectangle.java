public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        lenght = l;
        width = w;
    }

    public double area() {
        return lenght * width;
    }

    public String toString() {
        return super.toString() + "with length " + lenght + "and with width " + width + "\n";
    }
}
