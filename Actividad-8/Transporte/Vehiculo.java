//Ejercicio 1
package Transporte;

public class Vehiculo extends Object {
    protected String marca;
    protected double velocidadMaxima;

    public Vehiculo(){

    }

    public Vehiculo(String marca, double velocidMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("LA MARCA ES : " + marca + " Y SU VELOCIDAD MÁXIMA : " + velocidadMaxima + " KM.");
    }

}