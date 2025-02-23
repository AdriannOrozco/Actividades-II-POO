package Animales;

public class Pato extends Animal{
    
    @Override
    public void hacerSonido(){
        System.out.println("¡Cuac cuac cuac cuac cuac!");
    }

    @Override
    public void verAnimal(){
        System.out.println("El pato hace:");
        hacerSonido();
    }
}
