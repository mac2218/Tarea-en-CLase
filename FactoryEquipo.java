// Esta clase tiene una relacion de composicion con portero y delantero ya que usa el metodo para instanciar esas clases. 
// En otras palabras utiliza objetos de esas clases en esta.

public class FactoryEquipo{

    public static Delantero getDelantero(){
        return new Delantero();
    }
    
    public static Portero getPortero(){
        return new Portero();
    }
}