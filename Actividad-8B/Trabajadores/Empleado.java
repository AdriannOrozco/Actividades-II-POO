package Trabajadores;

public class Empleado extends Persona{
    
    protected String departamento;

    public Empleado(String nombre, int edad, String departamento){
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("DEPARTAMENTO : " + departamento);
    }
}
