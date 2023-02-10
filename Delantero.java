public class Delantero extends EquipoFut {
    
    private int cantPases;
    private int golesAnotados;
    private int golesFallados;
    private int faltas;

    public Delantero(){
        super();
        cantPases = 0;
        golesAnotados = 0;
        golesFallados = 0;
        faltas = 0;
    }
    
    public Delantero(String nombre, String apellido, int numJugador, int cantPases, int golesAnotados, int golesFallados, int faltas
    ){
        super(nombre, apellido, numJugador);
        this.cantPases = cantPases;
        this.golesAnotados = golesAnotados;
        this.golesFallados = golesFallados;
        this.faltas = faltas;
    }


    public int getCantPases() {
        return this.cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }   
}
