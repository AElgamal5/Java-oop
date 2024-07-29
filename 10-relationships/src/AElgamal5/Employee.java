package AElgamal5;

public class Employee {
    private int id;
    private double salary;
    private PersonalInformation personalInformation; // composition relationship
    private Department department; // Aggregation relationship

    public Employee(
            int id, double salary, String firstName,
            String middleName, String lastName,
            String bloodGroup, String accountNumber,
            String nationality, int yearOfBirth, Department department) {
        this.id = id;
        this.salary = salary;
        this.personalInformation = new PersonalInformation(firstName, middleName,
                lastName, bloodGroup, accountNumber,
                nationality, yearOfBirth);
        this.department = department;
    }

    // Association relationship
    public void work(Project project) {
        System.out.println(this.id + " is working in project: " + project.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", salary='" + salary + '\'' +
                ", personalInformation='" + personalInformation + '\'' +
                ", department='" + department +
                '}';
    }
}
