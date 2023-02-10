// Esta clase tiene una relacion de dependencia con las otras clases ya que usa metodos provenientes de varias clases.
public class Principal{

    public static void main(String[] args){

        Delantero jugador  = FactoryEquipo.getDelantero();

        jugador.setNombre("Juan");
        jugador.setApellido("Perez");
        jugador.setNumJugador(10);
        jugador.setCantPases(15);
        jugador.setGolesAnotados(2);
        jugador.setGolesFallados(1);
        jugador.setFaltas(3);

        System.out.println("\n" + " ..:: Informacion del delantero ::.." + "\n");
        System.out.println(jugador.toString());

        Portero jugador1  = FactoryEquipo.getPortero();

        jugador1.setNombre("Mario");
        jugador1.setApellido("Ramirez");
        jugador1.setNumJugador(5);
        jugador1.setPorteriasCero(3);
        jugador1.setGolesEncajados(0);
        jugador1.setGolesAtajados(4);

        System.out.println("\n" + " ..:: Informacion del portero ::.." + "\n");
        System.out.println(jugador1.toString());
    }

}