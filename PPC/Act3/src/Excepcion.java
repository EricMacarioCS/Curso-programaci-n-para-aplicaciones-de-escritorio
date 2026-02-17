public class Excepcion {
    public static void main(String[] args ){
        if (args.length != 3){
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(1);
        }
        
        int result = 0;

        try{
            switch (args[1].charAt(0)){
                case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
                case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
                case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
                case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
                default: System.out.println("Operador no valido: " + args[1]); System.exit(1);
            }
        } catch (NumberFormatException ex){
            System.out.println("Entrada incorrecta: " + ex.getMessage());
            System.exit(1);
        } catch (ArithmeticException ex){
            System.out.println("operacion no valida");
            System.out.println(ex.getMessage());
            System.exit(1);
        } 
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}

