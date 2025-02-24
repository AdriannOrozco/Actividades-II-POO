package Comida;

public class Pizza implements Corredor {

    @Override
    public void correr(){
    System.out.println("¡La pizza está corriendo!");
    }
    /* Esto es una mala práctica porque a nivel de lógica es imposible que naturalmente
     * una pizza pueda correr, esto no tiene nada de coherencia y es una mala práctica.
     * No sólo la pizza, ninguna comida puede correr, es un método con falta de coherencia.
     */
}
