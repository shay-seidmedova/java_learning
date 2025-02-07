package inheritance;

public class EmployeeTest {
    public static void main(String[] args) {
        Developer dev = new Developer(98000, 10, 30);
        System.out.println(dev.getSalary());
        System.out.println(dev.baseSalary);

        Manager manager = new Manager(150000, 10000);
        System.out.println(manager.getSalary());
    }
}
