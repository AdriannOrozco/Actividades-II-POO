package Ejercicio3;

import java.io.IOException;

public class TestFrutas {
    public static void main(String[] args) {
        limpiarPantalla();
        Frutas frutas = new Frutas();

        /* Aquí se muestra el error ya que se está usando el super de una clase
         * que no es derivada! Estamos trabajando directamente del main ya para
         * manipular datos.
         */
        super.nombre = "Papaya";

    }

      public static void limpiarPantalla() {
        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
