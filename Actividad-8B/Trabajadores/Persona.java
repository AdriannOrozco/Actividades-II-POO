//Ejercicio 1

package Trabajadores;

public class Persona extends Object {

    protected String nombre;
    protected int edad;

    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles(){
        System.out.println("NOMBRE : " + nombre + " Y EDAD : " + edad);
    }
}