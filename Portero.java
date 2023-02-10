public class Portero extends EquipoFut{
    private int porteriasCero;
    private int golesEncajados;
    private int golesAtajados;
    

    public Portero(){
        super();
        porteriasCero = 0;
        golesEncajados = 0;
        golesAtajados = 0;
        
    }
    
    public Portero(String nombre, String apellido, int numJugador, int porteriasCero, int golesEncajados, int golesAtajados){
        super(nombre, apellido, numJugador);
        this.porteriasCero = porteriasCero;
        this.golesEncajados = golesEncajados;
        this.golesAtajados = golesAtajados;
        this.faltas = faltas;

    }


    public int getPorteriasCero() {
        return this.porteriasCero;
    }

    public void setPorteriasCero(int porteriasCero) {
        this.porteriasCero = porteriasCero;
    }

    public int getGolesEncajados() {
        return this.golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        this.golesEncajados = golesEncajados;
    }

    public int getGolesAtajados() {
        return this.golesAtajados;
    }

    public void setGolesAtajados(int golesAtajados) {
        this.golesAtajados = golesAtajados;
    }

    @Override
    public String toString(){
        String resultado = super.toString();
        resultado = resultado + "Cantidad de porterias cero: " + getPorteriasCero() + "\n" +
            ", Goles encajados:'" + getGolesEncajados() + "\n" + 
            ", Goles atajados:" + getGolesAtajados() + "\n" +
            "}";
            return resultado;
    }

}

    

