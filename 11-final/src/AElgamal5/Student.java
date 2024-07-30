package AElgamal5;

public class Student {
    final int ID;
    String name;
    int year;
    static final double SUCCESS_DEGREE; // static blank final var

    static {
        SUCCESS_DEGREE = 50;
    }

    public Student(final int id, String name, int year) {
        // id = 0; // error can't update final parameter
        this.ID = id;
        this.name = name;
        this.year = year;
    }

    // final methods can't be overridden in child class
    final public void getStudentData() {
        System.out.println("ID = " + this.ID + "\n");
        System.out.println("name = " + this.name + "\n");
        System.out.println("year = " + this.year + "\n");
    }
}
