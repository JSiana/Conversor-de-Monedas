


import java.util.Scanner;

public class Menu {



    public final String menu = """
            1) Dolar -> Peso argentino
            2) Peso argentino -> Dolar
            3) Dolar -> Real brasileño
            4) Real brasileño -> Dolar
            5) Dolar -> Peso colombiano
            6) Peso colombiano -> Dolar
            7) Salir
            """;

    public String leerOpcionMoneda() {
        Scanner lectura = new Scanner(System.in);
        String opcion = lectura.nextLine().toLowerCase();
        while (!monedasDisponibles.toLowerCase().contains(opcion)) {
            System.out.println("La opción digitada no está disponible");
            System.out.println("Elija una opción válida");
            System.out.println("**********************************************************************************");
            opcion = lectura.nextLine().toLowerCase();
        }
        return opcion.toUpperCase();
    }
        public final String monedasDisponibles = """
                USD --- Dólar Estadounidense
                ARS --- Peso Argentino
                BRL --- Real Brasileño
                COP --- Peso Colombiano
                EUR --- Euro""";


}
