public class SinEx {

        public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
     public static void main(String[] args){
        if (args.length != 3){
            System.out.println("Usage: Java Calculator operand1 operator operand2");
            System.exit(1);
        }
        if (isNumeric(args[0])==false){
            System.out.println("El primer argumento no es valido: " + args[0]);
            System.exit(1);
        }
        if (isNumeric(args[2])==false){
            System.out.println("El Segundo argumento no es valido: " + args[2]);
            System.exit(1);
        }

        int result = 0;

        switch (args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
            default: System.out.println("Operador no valido: " + args[1]); System.exit(1);;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
