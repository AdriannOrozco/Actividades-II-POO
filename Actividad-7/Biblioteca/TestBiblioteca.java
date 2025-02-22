package Biblioteca;

import java.io.IOException;

public class TestBiblioteca {
    public static void main(String[] args) {
    limpiarPantalla();

    //Aquí generará error de compilación, ya que "Biblioteca" es abrastracto
    //Y no se puede instanciar!
    Biblioteca biblioteca = new Biblioteca();
        
    //Forma correcta de instanciar: se puede hacer ya que llamamos a una clase 
    //que no es abstracta, sino que hereda una de ellas.
    BibliotecarioCorregido bibliotecario = new BibliotecarioCorregido(3, 5000);
   bibliotecario.mostrarPago();
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
