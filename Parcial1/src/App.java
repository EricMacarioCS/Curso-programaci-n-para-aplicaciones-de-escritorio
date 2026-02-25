import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        //Prueba del objeto
        //Triangle t2 = new Triangle(2.0,3.0,4.0,"Rojo", true);
        //System.out.println(t2.toString() + " " + t2.getArea() + " " + t2.getPerimeter() + " " + t2.getColor() +" "+ t2.isFilled());


        //Falta añadir más sout's para que indique que tipo de dato quiere el sistema

        System.out.println("Introduce los datos del triangulo");

        try{
        Triangle t1 = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.next(), sc.nextBoolean());
        }
        catch(IllegalTriangleException ex){
            System.out.println(ex.getMessage());
        }
        finally{
            Triangle t1 = new Triangle();
        }
        System.out.println(t1.toString() + " " + t1.getArea() + " " + t1.getPerimeter() + " " + t1.getColor() +" "+ t1.isFilled());
    }
}
