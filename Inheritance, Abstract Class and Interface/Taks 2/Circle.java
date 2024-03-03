public class Circle extends Shape{
    private double radius;
    public Circle(){
        super();
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
    @Override
    public double getArea(){
        return Math.PI*Math.pow(getRadius(), 2);
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    @Override
    public String toString(){
        return "Circle [Shape[color "+getColor()+",filled "+isFilled()+"], radius "+getRadius()+"]";
    }
}