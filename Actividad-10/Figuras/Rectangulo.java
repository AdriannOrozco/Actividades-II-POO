public class Rectangulo extends Figura {

    protected int base;
    protected int altura;

    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
