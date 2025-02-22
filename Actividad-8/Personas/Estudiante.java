package Personas;

public class Estudiante extends Persona {
    protected String matricula;

    public Estudiante(String nombre, int edad, String matricula){
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void verInfo(){
        System.out.println(" || DATOS DEL ESTUDIANTE ||");
        super.verInfo();
        System.out.println(" >> Matricula << " + matricula + "");
    }

}
