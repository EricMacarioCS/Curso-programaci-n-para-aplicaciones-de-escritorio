public class Ejercicio5 {
     public void validarEdad(int edad) throws EdadInvalidaException {

        if (edad < 0) {
            throw new EdadInvalidaException("Edad inválida.");
        }

        System.out.println("Edad válida.");
    }

    public static void main(String[] args) {

        Ejercicio5 obj = null;  // a) Se asigna null

        try {
            obj.validarEdad(-5);  // Esto provoca NullPointerException
        } catch (Exception e) {  // b) Captura genérica
            System.out.println("Se capturó una excepción:");
            System.out.println(e);
        }
    }
}
