public class Convertir {
    private String result;
    private String monedaBase;
    private String monedaCon;

    private Double tasa;



    public Convertir(Moneda miMoneda) {
        this.result = miMoneda.result();
        this.monedaBase = miMoneda.base_code();
        this.monedaCon = miMoneda.target_code();
        this.tasa = miMoneda.conversion_rate();
    }

    public Convertir(String result, String monedaBase, String monedaCon, Double tasa) {
        this.result = result;
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

    @Override
    public String toString() {
        return "Convertir{" +
                "result='" + result + '\'' +
                ", monedaBase='" + monedaBase + '\'' +
                ", monedaCon='" + monedaCon + '\'' +
                ", tasa=" + tasa +
                '}';
    }
}
