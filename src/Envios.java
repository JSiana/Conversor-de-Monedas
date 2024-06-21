


import java.util.Scanner;

public class Envios {

    public void entradaDeDatos(int opcion, Double cantidad){
        Busqueda busqueda = new Busqueda();
        switch (opcion){
            case 1 :
                {
                        busqueda.buscaMoneda("USD","ARS",cantidad);
                }break;

            case 2:
                {
                        busqueda.buscaMoneda("ARS","USD",cantidad);
                }break;
            case 3:
            {
                busqueda.buscaMoneda("USD","BRL",cantidad);
            }break;
            case 4:
            {
                busqueda.buscaMoneda("BRL","USD",cantidad);
            }break;
            case 5:
            {
                busqueda.buscaMoneda("USD","COP",cantidad);
            }break;
            case 6:
            {
                busqueda.buscaMoneda("COP","USD",cantidad);
            }break;
            default:
                System.out.println("Error: La opcion que ingreso no existe");
            }
    }
    public void conversionDeLaCantidad(Double cantidad){



    }

        public final String monedasDisponibles = """
                USD --- Dólar Estadounidense
                ARS --- Peso Argentino
                BRL --- Real Brasileño
                COP --- Peso Colombiano
                EUR --- Euro""";


}
