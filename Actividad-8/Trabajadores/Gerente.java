package Trabajadores;

public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(){

    }
    
    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Departamento en: " + departamento);
    }
}
