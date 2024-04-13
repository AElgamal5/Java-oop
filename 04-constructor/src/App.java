public class App {
    public static void main(String[] args) {
        /*
         * Constructor: is a special type of methods that automatically called when
         * an instance (object) of a class is created.
         * 
         * Used to initialize object state and setting initial values for the object
         * 
         * Rules for creating constructor:
         * 1. constructor name must be like class name
         * 2. constructor must have no return type
         * 3. Java constructor can not be abstract, static, final, or synchronized
         * 
         * Types of constructor:
         * 1. No-Arg: a constructor that does not accept any arguments
         * 2. Parameterized: a constructor that accepts defined arguments
         * 3. Default: a constructor that created by complier when no another one
         * 
         * Constructor chaining:
         * when calling a constructor in another constructor of the same class
         */

        Product p1 = new Product();
        p1.display();

        Product p2 = new Product("Mobile", 60.5, 0, 200, "Samsung new mobile", "RED");
        p2.display();
    }
}
