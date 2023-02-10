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

    }

   
}

    

