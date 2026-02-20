public class Ejercicio2 {
    public static void main(String[] args) {

        try {
            throw new Exception("Error generado manualmente en el bloque try");

        } catch (Exception e) {
            System.out.println("Mensaje de la excepción:");
            System.out.println(e.getMessage());

            // c) Imprimir stack trace
            System.out.println("\nStack Trace:");
            e.printStackTrace();

        } finally {
            // d) Bloque finally
            System.out.println("\nSe ha alcanzado el bloque finally.");
        }
    }
}
