//Ejercicio 2
package Animales;

public class Animal extends Object{
    protected String especie;

    public Animal(){

    }

    public Animal(String especie){
        this.especie = especie;
    }

    public void mostrarEspecie(){
        System.out.println("La especie es " + especie);
    }
}
