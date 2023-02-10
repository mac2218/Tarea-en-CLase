public class Delantero extends EquipoFut {
    
    private int cantPases;
    private int golesAnotados;
    private int golesFallados;

    public Delantero(){
        super();
        cantPases = 0;
        golesAnotados = 0;
        golesFallados = 0;
    }
    
    public Delantero(String nombre, String apellido, int numJugador, int cantPases, int golesAnotados, int golesFallados){
        super(nombre, apellido, numJugador);
        this.cantPases = cantPases;
        this.golesAnotados = golesAnotados;
        this.golesFallados = golesFallados;

    }
    public int getGolesAnotados() {
        return this.golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getGolesFallados() {
        return this.golesFallados;
    }

    public void setGolesFallados(int golesFallados) {
        this.golesFallados = golesFallados;
    }
    
}
