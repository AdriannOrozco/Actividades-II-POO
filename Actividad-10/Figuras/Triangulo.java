public class Triangulo extends Figura {
    protected int base;
    protected int altura;

    public Triangulo(){

    }

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
    return (base * altura)/2;
    }
}
