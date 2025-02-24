package Aviones;

public class Avion implements Hablador {
    
    @Override
    public void hablar(){
    System.out.println("El avión está hablando.");
    }
     /* Esto es una mala práctica porque a nivel de lógica es imposible que naturalmente
     * un avión pueda hablar, esto no tiene nada de coherencia y es una mala práctica.
     * No sólo el avión, ningún avión puede hablar, es un método con falta de coherencia.
     */
}
