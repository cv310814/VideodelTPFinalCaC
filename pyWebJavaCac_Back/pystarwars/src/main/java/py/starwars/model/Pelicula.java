package py.starwars.model;

public class Pelicula {

    //Atributos
    private int id;
    private String nombre;
    private String descripcion;   
    private String genero;
    private String calificacion;
    private int anio;
    private int estrellas;
    private String director;

    public Pelicula(){}

    //Constructores
    public Pelicula(int id, String nombre, String descripcion, String genero, String calificacion, int anio,
    int estrellas, String director){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.calificacion = calificacion;
        this.anio = anio;
        this.estrellas = estrellas;
        this.director = director;     
    }

    public Pelicula(String nombre, String descripcion, String genero, String calificacion, int anio,
    int estrellas, String director){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.genero = genero;
        this.calificacion = calificacion;
        this.anio = anio;
        this.estrellas = estrellas;
        this.director = director;     
    }

    // metodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //toString
    // metodos personalizados
    @Override
    public String toString() {
        return "Pelicula [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", genero=" + genero
                + ", calificacion=" + calificacion + ", anio=" + anio + ", estrellas=" + estrellas + ", director="
                + director + "]";
    }
  
    
    
}
