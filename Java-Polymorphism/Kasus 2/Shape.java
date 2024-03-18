abstract public class Shape {
    protected String ShapeName;

    public Shape(String shape) {
        ShapeName = shape;
    }

    public abstract double area();

    public String toString() {
        String result = "Shape name: " + ShapeName + "\n";
        return result;
    }
}
