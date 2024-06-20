


import java.util.Scanner;

public class Envios {

    public void entradaDeDatos(int opcion){
        Busqueda busqueda = new Busqueda();
        switch (opcion){
            case 1 :
                {
                        busqueda.buscaMoneda("USD","ARS");
                }break;

            case 2:
                {
                        busqueda.buscaMoneda("ARS","USD");
                }break;
            case 3:
            {
                busqueda.buscaMoneda("USD","BRL");
            }break;
            case 4:
            {
                busqueda.buscaMoneda("BRL","USD");
            }break;
            case 5:
            {
                busqueda.buscaMoneda("USD","COP");
            }break;
            case 6:
            {
                busqueda.buscaMoneda("COP","USD");
            }break;
            default:
                System.out.println("Error: La opcion que ingreso no existe");
            }
    }

    public void conversionDeLaCantidad(Double tasa){
        Busqueda consulta = new Busqueda();
        Double cantidadConvertida = tasa * 2;
        System.out.println(cantidadConvertida);

    }
        public final String monedasDisponibles = """
                USD --- Dólar Estadounidense
                ARS --- Peso Argentino
                BRL --- Real Brasileño
                COP --- Peso Colombiano
                EUR --- Euro""";


}
