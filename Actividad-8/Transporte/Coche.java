package Transporte;

public class Coche extends Vehiculo {
    protected int numeroDePuertas;

    public Coche(){

    }

    public Coche(String marca, double velocidadMaxima, int numeroDePuertas){
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("NÚMERO DE PUERTAS : " + numeroDePuertas);
    }
}
