package Personal;

public abstract class Empleado extends Object {
        
    public abstract double calcularSalario();

    public void mostrarDetalles(){
        System.out.println("EL SALARIO ES : " + calcularSalario());
    }
}
