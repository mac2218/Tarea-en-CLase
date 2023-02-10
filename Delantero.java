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


    public int getCantPases() {
        return this.cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }   
}
