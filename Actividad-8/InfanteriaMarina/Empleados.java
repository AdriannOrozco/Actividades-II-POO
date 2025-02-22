package InfanteriaMarina;

public class Empleados extends Object {
    protected String nombre;
    private String numeroDeIdentificacion;

    public Empleados(){

    }

    public Empleados(String nombre, String numeroDeIdentificacion){
        this.nombre = nombre;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
    }

    public void mostarDatos(){
        System.out.println("El trabajador es " + nombre + " con número de identificación -> " + numeroDeIdentificacion + ".");
    }

}
