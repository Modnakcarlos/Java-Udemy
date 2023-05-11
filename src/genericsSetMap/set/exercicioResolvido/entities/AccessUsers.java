package genericsSetMap.set.exercicioResolvido.entities;

import java.util.Date;
import java.util.Objects;

public class AccessUsers implements Comparable<AccessUsers> {

    private String name;
    private Date date;

    public AccessUsers(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccessUsers that = (AccessUsers) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String toString() {
        return "Nome de usuário: "
                + name
                + "\n"
                + "Horário: "
                + date
                + "\n";
    }

    @Override
    public int compareTo(AccessUsers other) {
        return name.compareTo(other.getName());
    }
}
