package Personal;

public class Vendedor extends Empleado {
    
    protected int horas;
    protected double tarifaPorHora;
    protected double comisiones;

    public Vendedor(int horas, double tarifaPorHora, double comisiones){
        this.horas = horas;
        this.tarifaPorHora = tarifaPorHora;
        this.comisiones = comisiones;
    }

    @Override
    public double calcularSalario(){
        return (horas * tarifaPorHora) + comisiones;
    }
}
