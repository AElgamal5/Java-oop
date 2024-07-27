public class HourlyEmployee extends Employee {
    private double workHourPrice;
    private int hourlyRate;

    public HourlyEmployee(
            String name,
            String address,
            String department,
            String email,
            double salary,
            double workHourPrice,
            int hourlyRate) {
        super(name, address, department, email, salary);
        this.workHourPrice = workHourPrice;
        this.hourlyRate = hourlyRate;
    }

    public double getWorkHourPrice() {
        return workHourPrice;
    }

    public void setWorkHourPrice(double workHourPrice) {
        this.workHourPrice = workHourPrice;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getSalary() {
        return this.workHourPrice * this.hourlyRate;
    }
}
