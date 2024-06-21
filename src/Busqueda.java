import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Busqueda {

    public void buscaMoneda (String monedaBase, String codigoConvertir,Double cantidad) {

            try {
                URI direccion = URI.create(
                        "https://v6.exchangerate-api.com/v6/24e34214a672185083580f15/pair/"
                                + monedaBase + "/" + codigoConvertir);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();


                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                //System.out.println(json);


                Gson gson = new Gson();

                Moneda miMoneda = gson.fromJson(json,Moneda.class);
                //System.out.println(miMoneda);

                Convertir miConversion = new Convertir(miMoneda);
                //System.out.println(miConversion);
                //System.out.println(miConversion.getTasa());


                Double resultado;
                resultado = cantidad * miConversion.getTasa();
                System.out.println("************************************");
                System.out.println(cantidad + " " + monedaBase +" es igual a "+
                        resultado +" "+codigoConvertir);
                System.out.println("************************************");

            } catch (Exception e) {
                throw new RuntimeException("No se pudo realizar la conversión");
            }

    }

}