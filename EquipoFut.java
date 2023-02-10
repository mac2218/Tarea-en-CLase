//Esta es la clase padre la cual mantiene una relacion de herencia con delantero y portero

public abstract class EquipoFut{
    
    protected String nombre;
    protected String apellido;
    protected int numJugador;

    public EquipoFut(){
        nombre = "";
        apellido = "";
        numJugador = 0;
    }

    public EquipoFut(String nombre, String apellido, int numJugador){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numJugador = numJugador;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumJugador() {
        return this.numJugador;
    }

    public void setNumJugador(int numJugador) {
        this.numJugador = numJugador;
    }

    @Override
    public String toString(){
        return "{" +
            " Nombre:'" + getNombre() + "'" +
            ", Apellido:'" + getApellido() + "'" +
            ", Numero de jugador:'" + getNumJugador() + "'" +
            "}";
    }
}
