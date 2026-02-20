
public class Ejercicio4 {

    
    public void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        }

        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {

        Ejercicio4 obj = new Ejercicio4();

        try {
            obj.validarEdad(-5);
        } catch (EdadInvalidaException e) {
            System.out.println("Se capturó la excepción:");
            System.out.println(e.getMessage());
        }
    }
}
