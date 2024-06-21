import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Busqueda busqueda = new Busqueda();

        boolean confi = false;
        Scanner entrada = new Scanner(System.in);

        System.out.println("************************************");
        System.out.println("Bienvenido(a) al conversor de moneda");
        System.out.println("************************************\n");

        while(confi!=true) {
            System.out.println("Elija una opcion valida");
            System.out.println("-----------------------");

            int opcion;
            String menu = """
                    1) Dolar -> Peso argentino
                    2) Peso argentino -> Dolar
                    3) Dolar -> Real brasileño
                    4) Real brasileño -> Dolar
                    5) Dolar -> Peso colombiano
                    6) Peso colombiano -> Dolar
                    7) Salir
                    """;
            System.out.println(menu);
            opcion = entrada.nextInt();

            if (opcion == 7) {
                break;
            }

                Double cantidad;
                System.out.println("Escriba la cantidad que desea convertir");
                cantidad = entrada.nextDouble();
                Envios envios = new Envios();
                envios.entradaDeDatos(opcion,cantidad);
       }
        System.out.println("-----------------------------\n");
        System.out.println("Gracias por usar mi programa");
    }
}
