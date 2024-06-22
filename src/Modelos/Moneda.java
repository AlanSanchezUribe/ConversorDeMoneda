package Modelos;

public class Moneda {

    private String pais;
    private Double valor;

    public Moneda(String pais, Double valor) {
        this.pais = pais;
        this.valor = valor;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Moneda{" + "pais=" + pais + ", valor=" + valor + '}';
    }


}
