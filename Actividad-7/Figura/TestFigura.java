import java.io.IOException;

public class TestFigura {

    public static void main(String[] args) {
        limpiarPantalla();
        System.out.println(" || RECTÁNGULO ||");
        Rectangulo rectangulo = new Rectangulo(12, 3);
        rectangulo.mostrarArea();
        System.out.println("");
        System.out.println(" || CIRCULO ||");
        Circulo circulo = new Circulo(12);
        circulo.mostrarArea();
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
