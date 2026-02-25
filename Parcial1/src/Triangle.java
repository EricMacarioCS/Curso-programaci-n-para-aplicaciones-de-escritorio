import java.math.*;

public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private double s = (side1 + side2 + side3) /2;

    public Triangle (){};
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException{
        super(color,filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getArea(){
        
        double x = (s - side1)+(s - side2)+(s - side3);
        
        return Math.sqrt(s);
    }
    public double getPerimeter(){
        return side1;
    }

    public String toString(){
        return "Triángulo: side1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3;
    }
}
