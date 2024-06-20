import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;

public class Convertir {
    @SerializedName("base_code")
    private String monedaBase;
    private String monedaCon;
@SerializedName("conversion_rate")
    private Double tasa;
    private Double cantidadCambiada;

    public Convertir(String monedaBase, String monedaCon, Double tasa) {
        this.monedaBase = monedaBase;
        this.monedaCon = monedaCon;
        this.tasa = tasa;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaCon() {
        return monedaCon;
    }

    public void setMonedaCon(String monedaCon) {
        this.monedaCon = monedaCon;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }

    public Double getCantidadCambiada() {
        return cantidadCambiada;
    }

    public void setCantidadCambiada(Double cantidadCambiada) {
        this.cantidadCambiada = cantidadCambiada;
    }
}
