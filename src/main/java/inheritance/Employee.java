package inheritance;

public sealed class Employee permits Developer, Manager {

    protected double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    double getSalary() {
        return 0L;
    }
}
