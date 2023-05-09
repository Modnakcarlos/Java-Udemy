package interfaces.interfaceComparable.entities;

public class Employee implements Comparable<Employee> {

    private final String name;
    private final Double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return -salary.compareTo(other.getSalary());
    }
}
