public class Rectangle extends Shape{
    private double width;
    private double length;
    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width = w;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double l){
        length = l;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "Ractangle [Shape=[color= "+getColor()+",filled= "+isFilled()+"], width= "+getWidth()+",lenght= "+getLength()+"]";
    }
}