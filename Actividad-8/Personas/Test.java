package Personas;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
    limpiarPantalla();
    Estudiante estudiante = new Estudiante("Osvaldo", 20, "Académica");
    estudiante.verInfo();
    System.out.println("");
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
