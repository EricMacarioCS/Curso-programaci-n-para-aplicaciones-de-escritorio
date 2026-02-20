public class Ejercicio1 {
      public static void main(String[] args) {

        try {
            // a) Lanzar un objeto Exception con mensaje personalizado
            throw new Exception("Error generado manualmente en el bloque try");

        } catch (Exception e) {
            // b) Imprimir el mensaje de la excepción
            System.out.println("Mensaje de la excepción:");
            System.out.println(e.getMessage());
        }
    }
}
