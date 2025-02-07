package inheritance;

public non-sealed class Manager extends Employee {

    protected double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    double getSalary() {
        return baseSalary + bonus;
    }
}
