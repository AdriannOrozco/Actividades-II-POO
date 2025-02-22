//Ejercicio 2
package Personas;
public class Persona {
    protected String nombre;
    protected int edad;

public Persona(){

}

public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}

public void verInfo(){
    System.out.println("El nombre es " + nombre + " y su edad es de " + edad + " años.");
}
}
