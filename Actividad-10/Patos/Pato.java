package Patos;

public class Pato implements Nadador, Volador {
    
    @Override
    public void nadar(){
    System.out.println("¡El pato está nadando!");
    }

    @Override
    public void volar(){
    System.out.println("¡El pato está volando!");
    }
}
