package Patos;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        limpiarPantalla();
        Pato pato = new Pato();
        System.out.println("");
        pato.volar();
        System.out.println("------------------------");
        pato.nadar();
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
