package Personal;

public class Gerente extends Empleado {

    protected int horas;
    protected double tarifaHora;
    protected double bono;

    public Gerente(int horas, double tarifaHora, double bono){
        this.horas = horas;
        this.tarifaHora = tarifaHora;
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        return (horas * tarifaHora) + bono;
    }

    }

