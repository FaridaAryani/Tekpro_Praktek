//Represents a type of paint that has a fixed area covered by a gallon. All measurements are in the feet.
public class Paint {
    private double coverage; // Number of square feet per gallon

    // Constructor: Sets up the paint object.
    public Paint(double c) {
        coverage = c;
    }

    // return the amount of paint (number of gallons) needed to paint the shape
    // given as the parameter
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}