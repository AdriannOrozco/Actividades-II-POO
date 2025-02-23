package Ejercicio3;

public class Moto extends Vehiculo {
    public int cilindraje;

    public Moto(int cilindraje){
        super();
    }

    @Override
    public void mostrarMarca(){
        /* Esto muestra error porque como hemos aprendido en talleres anteriores
         * la variable marca no es visible porque es un tipo private, sólo se puede
         * acceder a ella con métodos de acceso (get and set) o de lo contrario que
         * se cambie a public.
         */
        System.out.println(super.marca);
        System.out.println("CC: " + cilindraje);
    }
}
