package AElgamal5;

final public class GraduatedStudent extends Student {
    int graduationYear;

    public GraduatedStudent(final int id, String name, int year, int graduationYear) {
        super(id, name, year);
        this.graduationYear = graduationYear;
    }

    // error can't override a final method
    // @Override
    // public void getStudentData() {
    // System.out.println("ID = " + this.ID + "\n");
    // System.out.println("name = " + this.name + "\n");
    // System.out.println("year = " + this.year + "\n");
    // }
}
