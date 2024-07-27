public class Developer extends Employee {
    String projectName;

    public Developer() {
        System.out.println("Subclass Developer No-Args constructor");
    }

    public Developer(
            String name,
            String email,
            String phone,
            String department,
            String address,
            int yearOfBirth,
            String projectName) {
        super(projectName, email, phone, department, address, yearOfBirth);
        this.projectName = projectName;
    }

    public String getProjectName() {
        return this.projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phone='" + getPhone() + '\'' +
                ", department='" + getDepartment() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
