package Animales;

public class Animal implements Nadador, Volador {
    
    @Override
    public void nadar(){
    System.out.println("¡El animal está nadando!");
    }

    @Override
    public void volar(){
    System.out.println("¡El animal está volando!");
    }
}
