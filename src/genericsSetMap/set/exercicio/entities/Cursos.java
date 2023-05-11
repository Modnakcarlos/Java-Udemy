package genericsSetMap.set.exercicio.entities;

import java.util.Objects;

public class Cursos implements Comparable<Cursos> {
    private Integer code;
    private String name;

    public Cursos(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return Objects.equals(code, cursos.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Cursos other) {
        return code.compareTo(other.getCode());
    }

    @Override
    public String toString() {
        return "Nome dos alunos do professor Alex: "
                + "\n"
                + "nome do aluno: "
                + name
                + "\n"
                + "Código do aluno: "
                + code
                + "\n";
    }
}
