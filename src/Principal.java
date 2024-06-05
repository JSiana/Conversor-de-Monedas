
public class Principal {

    public static void main(String[] args) {

        Busqueda consulta = new Busqueda();
        System.out.println("**********************************************************************************\n");
        System.out.println("*** Bienvenid@ al conversor de moneda ***\n");


        Menu menu = new Menu();
        menu.mostrarMenuMonedas("inicial");
        String monedaBase = menu.leerOpcionMoneda();
        menu.mostrarMenuMonedas("final");
        String monedaFinal = menu.leerOpcionMoneda();
        Double cantidadCambiar = menu.leerCantidadACambiar();
        Moneda conversor = consulta.buscaMoneda(monedaBase);
        Double tasaDeConversion = conversor.getConversionRate(monedaFinal.toUpperCase());

        Double cantidadObtenida = menu.cantidadObtenida(monedaBase, cantidadCambiar, tasaDeConversion, monedaFinal);


    }
}
