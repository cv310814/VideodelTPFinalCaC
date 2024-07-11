package py.starwars.model;

public class Actor extends Persona {

    int cantPeliculas;

    public Actor(String nombre, String apellido, int anioNacimiento, int cantPeliculas) {
        super(nombre, apellido, anioNacimiento);
        this.cantPeliculas = cantPeliculas;
    }

    public int getCantPeliculas(){
        return cantPeliculas;
    }

    public void setCantPeliculas(int cantPeliculas){
        this.cantPeliculas = cantPeliculas;
    }

    @Override
    public String toString(){
        return "Actor [getCantPeliculas()=" + getCantPeliculas() + ", super.toString()=" + super.toString() + "]";
    }
}
