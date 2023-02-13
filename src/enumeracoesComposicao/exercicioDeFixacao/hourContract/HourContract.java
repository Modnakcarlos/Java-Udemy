package enumeracoesComposicao.exercicioDeFixacao.hourContract;

import java.util.Date;

public class HourContract {
    Date date;
    Double valorPorHora;
    Integer horas;

    public HourContract() {
    }

    public HourContract(Date date, Double valorPorHora, Integer horas) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horas = horas;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getHoras() {
        return horas;
    }

    public double totalValue() {
        return valorPorHora * horas;
    }
}
