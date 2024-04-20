import Outer.Inner;

public class App {
    static int prop;
    static {
        System.out.println("From static block");
        prop = 0;
    }

    public static void main(String[] args) {
        /*
         * Static is a keyword that is used to declare members:
         * 1. props
         * 2. methods
         * 3. blocks
         * 4. classes
         * 
         * Static members belong to the class itself not to an instance
         * 
         * Static data saved on time in memory
         * 
         * Static members can by accessed by class without creating an instance
         * 
         * Static methods can't use non-static data members or call non-static methods
         * directly
         * 
         * Keywords 'this' and 'super' can't be use in static context
         * 
         * Static block called automatically & only time before contractor
         * 
         * Static block used to initialize a static props
         * 
         * Static class can only made if it a nested class
         * 
         * Static nested classes are often used to logically group classes that are only
         * used in one place or to increase encapsulation. They are similar to regular
         * top-level classes but are nested for organizational purposes.
         */

        Student s1 = new Student("Ahmed", "123456");
        System.out.println(s1);

        Student s2 = new Student("Amir", "456789");
        System.out.println(s2);

        Student s3 = new Student("Samir", "12378");
        System.out.println(s3);

        System.out.println(Student.collage); // "Eng"
        System.out.println(Student.num); // number of created instances

        System.out.println(s1.logIn("2024-1", "123456"));

    }
}
