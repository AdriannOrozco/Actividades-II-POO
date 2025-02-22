package Personal;

import java.io.IOException;

public class TestPersonal {
    public static void main(String[] args) {
        limpiarPantalla();
        System.out.println("|| DETALLES DEL GERENTE ||");
        Gerente gerente = new Gerente(40, 25000, 125000);
        gerente.mostrarDetalles();
        System.out.println("");
        System.out.println("|| DETALLES DEL VENDEDOR ||");
        Vendedor vendedor = new Vendedor(40, 20000.5, 30000.2);
        vendedor.mostrarDetalles();
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
