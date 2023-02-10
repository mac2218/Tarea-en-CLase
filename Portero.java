public class Portero extends EquipoFut{
    private int cantPases;
    private int golesEncajados;
    private int golesAtajados;
    private int faltas;

    public Portero(){
        super();
        cantPases = 0;
        golesAnotados = 0;
        golesFallados = 0;
        faltas = 0;
    }
    
    public Portero(String nombre, String apellido, int numJugador, int cantPases, int golesAnotados, int golesFallados, int faltas){
        super(nombre, apellido, numJugador);
        this.cantPases = cantPases;
        this.golesAnotados = golesAnotados;
        this.golesFallados = golesFallados;
        this.faltas = faltas;

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
    
    public int getCantPases() {
        return this.cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }   
}

    
}
