package Trabajadores;

import java.io.IOException;

public class TestTrabajadores {
    
    public static void main(String[] args) {
        limpiarPantalla();
        System.out.println("|| DETALLES DEL EMPLEADO ||");
        Empleado empleado = new Empleado("José", 1240000.200);
        empleado.mostrarDetalles();

        System.out.println("");

        System.out.println(" || DETALLES DEL GERENTE ||");
        Gerente gerente = new Gerente("Pedro", 1600000, "Bolívar");
        gerente.mostrarDetalles();

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
