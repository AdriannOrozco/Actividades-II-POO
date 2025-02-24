import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        limpiarPantalla();
        System.out.println("");
        Rectangulo rectangulo = new Rectangulo(2, 2);
        rectangulo.verArea();
        System.out.println("-------------------------------------");
        Triangulo triangulo = new Triangulo(6,6);
        triangulo.verArea();
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
