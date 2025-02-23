package Animales;

public abstract class Animal {
    
    public abstract void hacerSonido();

    //Método concreto
    public void verAnimal(){
        System.out.println("El animal hace este sonido: ");
        hacerSonido();
    }
}
