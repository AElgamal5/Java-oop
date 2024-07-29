package AElgamal5;

public class Department {

    private int number;
    private String name;

    public Department() {
    }

    public Department(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "number='" + number + '\'' +
                ", name='" + name +
                '}';
    }
}
