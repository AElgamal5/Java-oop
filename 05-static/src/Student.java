public class Student {
    static String collage = "Eng";
    static int num = 1;
    private String name;
    private String id;
    private String password;
    private boolean loggedIn = false;
    private static int minimumPasswordLength = 6;

    public Student(String name, String password) {
        if (!Student.isGoodPassword(password)) {
            System.out.println("short password");
            return;
        }
        this.id = "2024-" + Student.num;
        this.name = name;
        this.password = password;
        Student.num++;

    }

    public String toString() {
        return "Name: " + this.name + "\nID: " + this.id + "\nCollage: " + Student.collage + "\n";
    }

    public boolean logIn(String id, String password) {
        if (loggedIn) {
            return true;
        }

        if (this.id.equals(id) && this.password.equals(password)) {
            this.loggedIn = true;
            return true;
        }

        return false;
    }

    public static boolean isGoodPassword(String password) {
        return password.length() >= Student.minimumPasswordLength;
    }
}
