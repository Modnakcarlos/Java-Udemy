package enumeracoesComposicao.exercicioDeFixacao.entities.hourContract;

import java.util.Date;

public class HourContract {
    Date date;
    Double valorPorHora;
    Integer horasTrabalhadas;

    public HourContract() {
    }

    public HourContract(Date date, Double valorPorHora, Integer horasTrabalhadas) {
        this.date = date;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
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

    public void setHoras(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Integer getHoras() {
        return horasTrabalhadas;
    }

    public double totalValue() {
        return valorPorHora * horasTrabalhadas;
    }
}
