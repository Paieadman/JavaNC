import java.lang.Math;
public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius){
        this(radius, "red");
    }

    public Circle(){
        this(1.0d);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Circle[ radius = "+this.radius+", color = "+ this.color+"]";
    }

    public double getArea(){
        return (Math.PI*this.radius*this.radius);
    }

    @Override
    public int hashCode(){
        int res = 17;
        res = 31*res+ (int)(Double.doubleToLongBits(radius)^(Double.doubleToLongBits(radius))>>32);
        res = 31*res + color.hashCode();
        return res;
    }
    public boolean equals(Circle cir){
        if(cir.hashCode() == this.hashCode())
        {return true;}
        else{
            return false;
        }
    }
}
