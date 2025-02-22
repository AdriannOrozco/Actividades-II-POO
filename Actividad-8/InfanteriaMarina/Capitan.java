package InfanteriaMarina;

public class Capitan extends Empleados {

    @Override
    public void mostarDatos(){
        System.out.println("El nombre es " + nombre + " con número de identificación " 
        + numeroDeIdentificacion);
    /* Aquí podemos ver que se genera un error, pues recordemos que declaramos el 
     * número de identificación como private, a diferencia del nombre que es tipo
     * protegido (podemos acceder solo de un package de la misma clase) entonces
     * sólo podemos acceder al nombre porque es público.
     * La única forma de acceder al numero de identificación son con métodos de acceso.
     */
    }
}
