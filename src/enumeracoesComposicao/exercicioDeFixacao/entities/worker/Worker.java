package enumeracoesComposicao.exercicioDeFixacao.entities.worker;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enumeracoesComposicao.exercicioDeFixacao.entities.departament.Departamento;
import enumeracoesComposicao.exercicioDeFixacao.entities.hourContract.HourContract;
import enumeracoesComposicao.exercicioDeFixacao.entities.workerLevel.Experiencia;

public class Worker {
    private String name;
    private Experiencia experiencia;
    private Double salarioBase;

    private Departamento departamento;
    private List<HourContract> contratos = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, Experiencia experiencia, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.experiencia = experiencia;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public List<HourContract> getContratos() {
        return contratos;
    }

    public void addContrato(HourContract contratos) {
        this.contratos.add(contratos);
    }

    public void removeContrato(HourContract contratos) {
        this.contratos.remove(contratos);
    }

    public double income(int mes, int ano) {
		double sum = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contratos) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month =1 + cal.get(Calendar.MONTH);
			if (ano == c_year && mes == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}