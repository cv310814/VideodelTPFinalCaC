package py.starwars.model;

public class Director extends Persona {

    private int cantPeliDirigidas;

    public Director(String nombre, String apellido, int anioNacimiento, int cantPeliDirigidas) {
        super(nombre, apellido, anioNacimiento);
        this.cantPeliDirigidas = cantPeliDirigidas;
    }

    public int getCantPeliculas(){
        return cantPeliDirigidas;
    }

    public void setCantPeliculas(int cantPeliDirigidas) {
        this.cantPeliDirigidas = cantPeliDirigidas;
    }


}
