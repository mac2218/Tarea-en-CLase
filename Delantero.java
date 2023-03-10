
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

    public int getFaltas() {
        return this.faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString(){
        String resultado = super.toString();
        resultado = resultado + " Cantidad de pases: " + getCantPases() + "\n" +
            " Goles anotados:'" + getGolesAnotados() + "\n" + 
            " Goles fallados:" + getGolesFallados() + "\n" +
            " Faltas:" + getFaltas() + "\n";
            return resultado;
    }
}
