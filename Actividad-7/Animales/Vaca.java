package Animales;

public class Vaca extends Animal {
    
    @Override
    public void hacerSonido(){
        System.out.println("Muu-muu");
    }

    @Override
    public void verAnimal(){
        System.out.println("La vaca hace:");
        hacerSonido();
    }

}
