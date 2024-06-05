import java.time.LocalDateTime;

public class Convertir {
    private String moneda;
    private String monedaObetivo;

    private Double cantidadACambiar;
    private Double cantidadCambiada;
    private LocalDateTime info;

    public Convertir(String moneda, String monedaObetivo, Double cantidadACambiar, Double cantidadCambiada) {
        this.moneda = moneda;
        this.monedaObetivo = monedaObetivo;
        this.cantidadACambiar = cantidadACambiar;
        this.cantidadCambiada = cantidadCambiada;
        this.info = LocalDateTime.now();
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMonedaObetivo() {
        return monedaObetivo;
    }

    public void setMonedaObetivo(String monedaObetivo) {
        this.monedaObetivo = monedaObetivo;
    }

    public Double getCantidadACambiar() {
        return cantidadACambiar;
    }

    public void setCantidadACambiar(Double cantidadACambiar) {
        this.cantidadACambiar = cantidadACambiar;
    }

    public Double getCantidadCambiada() {
        return cantidadCambiada;
    }

    public void setCantidadCambiada(Double cantidadCambiada) {
        this.cantidadCambiada = cantidadCambiada;
    }

    public LocalDateTime getInfo() {
        return info;
    }

    public void setInfo(LocalDateTime info) {
        this.info = info;
    }
}
