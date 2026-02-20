class ExcepcionA extends Exception {
    public ExcepcionA(String mensaje) {
        super(mensaje);
    }
}

class ExcepcionB extends Exception {
    public ExcepcionB(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio6 {
    // a) Método que lanza excepción propia
    public void metodoA() throws ExcepcionA {
        throw new ExcepcionA("Error generado en metodoA");
    }

    // b) Método que captura y relanza otra excepción
    public void metodoB() throws ExcepcionB {

        try {
            metodoA();
        } catch (ExcepcionA e) {
            throw new ExcepcionB("Error en metodoB provocado por metodoA");
        }
    }

    public static void main(String[] args) {

        Ejercicio6 obj = new Ejercicio6();

        try {
            obj.metodoB();
        } catch (ExcepcionB e) {
            System.out.println("Se capturó ExcepcionB:");
            e.printStackTrace();  // e) imprimir stack trace
        }
    }
}
