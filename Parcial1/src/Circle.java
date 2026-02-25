import java.math.*;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){};
    public Circle(double radius,String color, boolean filled){
        
        super(color,filled);
        this.radius = radius;
        
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * (radius * radius);
    }
    public double getPerimeter(){
        return radius;
    }
    public double getDiameter(){
        return radius;
    }

    public void printCircle(){
        System.out.println(radius + " " + super.getColor() +  " " + super.isFilled() + " " + getArea());
    }
}
