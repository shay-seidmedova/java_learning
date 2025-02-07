package inheritance;

public non-sealed class Developer extends Employee{

    public double hoursWorked;
    public double overTimeRate;

    public Developer(double baseSalary, double hoursWorked, double overTimeRate) {
        super(baseSalary);
        this.hoursWorked = hoursWorked;
        this.overTimeRate = overTimeRate;
    }

    @Override
    double getSalary() {
        return baseSalary + (hoursWorked + overTimeRate);
    }
}
