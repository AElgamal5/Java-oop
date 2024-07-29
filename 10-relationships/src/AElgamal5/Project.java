package AElgamal5;

public class Project {
    private int number;
    private String name;

    public Project() {
    }

    public Project(int number, String name) {
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
        return "Project{" +
                "number='" + number + '\'' +
                ", name='" + name +
                '}';
    }
}
