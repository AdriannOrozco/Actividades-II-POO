//Ejercicio 3
package Trabajadores;

public class Empleado extends Object {
    protected String nombre;
    protected double salario;

    public Empleado(){
        
    }

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles(){
        System.out.println("El nombre es " + nombre + " y su salario es de " + salario + " COP.");
    }
}
