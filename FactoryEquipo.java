public class FactoryEquipo{

    public static EquipoFut getEquipoFut(String tipo){

        if(tipo.equals("Delantero")){

            return new Delantero();

        }else{
            return new Portero();
        }

    }
    
}