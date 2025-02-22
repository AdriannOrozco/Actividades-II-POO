package Biblioteca;

public abstract class Biblioteca {

    public abstract double prestamoLibro();

    public void mostrarPago(){
        System.out.println("El pago por prestamo es: -> " + prestamoLibro());
    }
}
