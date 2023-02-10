// Esta clase tiene una relacion de composicion con portero y delantero ya que usa el metodo para instanciar esas clases. 
// En otras palabras utiliza objetos de esas clases en esta.

public class FactoryEquipo{

    public static EquipoFut getEquipoFut(String tipo){

        if(tipo.equals("Delantero")){

            return new Delantero();

        }else{
            return new Portero();
        }

    }
    
}