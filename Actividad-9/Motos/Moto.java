package Motos;

public class Moto implements Acelerador, Frenador {
    /* Aquí se genera error claramente porque no hemos usado los métodos 
     * abtractos de las intefaces y para solucionar este error sólo hay que
     * usarlos con su sobreescritura
     */

    //Solución

    /* @Override
     * public void acelelar(){
     * System.out.println("La moto ha acelerado.")}
     */

      /* @Override
     * public void frenar(){
     * System.out.println("La moto ha frenado.")}
     */
}
