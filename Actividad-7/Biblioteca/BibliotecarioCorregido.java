package Biblioteca;

public class BibliotecarioCorregido extends Biblioteca {

    protected int dias;
    protected double tarifaPorDia;

    public BibliotecarioCorregido(int dias, double tarifaPorDia){
        this.dias = dias;
        this.tarifaPorDia = tarifaPorDia;
    }

    //Aqui desaparece el error ya que usamos el método de la clase abstracta
    //Biblioteca!
    @Override
    public double prestamoLibro(){
        return dias * tarifaPorDia;
    }
}
