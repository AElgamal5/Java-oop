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
         * 4. Copy: a constructor that create an obj using another obj from same class
         * 
         * Constructor chaining:
         * when calling a constructor in another constructor of the same class
         * 
         * Finalizers aka Destructor:
         * In Java, when we create an object of the class it occupies some space in the
         * memory (heap). If we do not delete these objects, it remains in the memory
         * and occupies unnecessary space that is not upright from the aspect of
         * programming.
         * 
         * Java provides a garbage collector that works the same as the destructor. The
         * garbage collector is a program (thread) that runs on the JVM. It
         * automatically deletes the unused objects and frees up the memory. The
         * programmer has no need to manage memory, manually. It can be error-prone, and
         * vulnerable, and may lead to a memory leak.
         * 
         */

        Product p1 = new Product();
        p1.display();

        System.out.println("=================================");

        Product p2 = new Product("Mobile", 60.5, 0, 200, "Samsung new mobile", "RED");
        p2.display();

        System.out.println("=================================");
        Product p3 = new Product(p2);

        p3.display();
    }
}
