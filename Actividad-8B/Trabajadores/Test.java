package Trabajadores;

import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        limpiarPantalla();

        System.out.println(" || DATOS DE LA PERSONA ||");
        Persona persona = new Persona("Camilo",20);
        persona.mostrarDetalles();
        System.out.println("");

        System.out.println(" || DATOS DEL EMPLEADO ||");
        Empleado empleado = new Empleado("Jaber", 18, "Bolívar");
        
        empleado.mostrarDetalles();
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
