public class SalariedEmployee extends Employee {
    private double bonus;

    public SalariedEmployee(String name, String address, String department, String email, double salary, double bonus) {
        super(name, address, department, email, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    // @Override
    public static void print() {
        System.out.println("SalariedEmployee class");
    }
}
