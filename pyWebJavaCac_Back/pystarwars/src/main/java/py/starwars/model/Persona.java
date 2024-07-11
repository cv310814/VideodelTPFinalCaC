package py.starwars.model;

public class Persona {

    
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    protected Persona(){}

    protected Persona(String nombre, String apellido, int anioNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioNacimiento = anioNacimiento;
    }

    
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getApellido() {
        return apellido;
    }

    protected void setApellido(String apellido) {
        this.apellido = apellido;
    }

    protected int getAnioNacimiento() {
        return anioNacimiento;
    }

    protected void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
                + ", getAnioNacimiento()=" + getAnioNacimiento() + "]";
    }


}
