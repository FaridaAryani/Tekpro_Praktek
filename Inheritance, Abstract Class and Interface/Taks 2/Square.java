public class Square extends Rectangle{
    private double side;
    public Square(){
        super();
        side = 1.0;
    }
    public Square(double side){
        super(side,side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double s){
        side = s;
        setWidth(s);
        setLength(s);
    }
    @Override
    public void setWidth(double s){
        super.setWidth(s);
        side = s;
    }
    @Override
    public void setLength(double s){
        super.setLength(s);
        side = s;
    }
    @Override
    public String toString(){
        return "Square[Rectangle[Shape[color="+getColor()+",filled= "+isFilled()+"], width= "+getWidth()+", length= "+getLength()+"]]";
    }
}