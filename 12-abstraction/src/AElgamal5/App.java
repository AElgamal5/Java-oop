package AElgamal5;

public class App {
    public static void main(String[] args) {
        /*
         * - Tightly encapsulated class: is a class that every data member declared as a
         * private, whether tha class has getter & setters or not and whatever those
         * methods is public or not.
         * 
         * - OOP provide reusability:
         * 1- Inheritance
         * 2- Association
         * 3- Polymorphism
         * 
         * - OOP provide security:
         * 1- Data hiding => private
         * 2- Encapsulation => setters, getters, and private
         * 
         * - Abstraction: plays a role in security and reusability.
         * 
         * - Abstraction: hiding the internal implementation of the method aka feature
         * and only showing the functionality to the users.
         * 
         * - Types of Abstraction:
         * 1- Data abstraction
         * 2- control abstraction
         * 
         * - To achieve the abstraction:
         * 1- Abstract class => partial abstraction
         * 2- Interface => fully abstraction
         * 
         * - Abstract Class: is a class that cannot be instantiated on its own and is
         * meant to be subclassed. It can have abstract methods (methods without
         * implementation) and concrete methods (methods with implementation).
         * - Its designed to allow us to create blueprints for concrete classes.
         * 
         * - Concrete class: is a class all of its methods have an implementation or all
         * of its methods are concrete.
         * 
         * - Concrete method: is a methods that has an implementation aka body.
         * 
         * - Abstract method: is a methods that has no implementation aka body and only
         * has a signature.
         * 
         * - Abstract keyword is not a access provider.
         * 
         * - Abstract class rules:
         * 1- it declared 'abstract' keyword
         * 2- it cannot be instantiated
         * 3- it can have abstract and non-abstract methods
         * 4- it can have constructors
         * 5- it can have final methods
         * 6- it can have static methods
         * 
         * - Abstract class constructors should be protected to used only form child.
         * 
         * - We can't use abstract keyword with static method.
         * 
         * - We can't use private access modifiers with abstract method in abstract
         * class.
         * 
         */

        SUV s1 = new SUV(4, "Black", 1.30, 2.3);
        SUV.startEngin();
        s1.autoPilot();

        Hatchback h1 = new Hatchback();
        h1.autoPilot();
        h1.streamingService();
        h1.parkingSenors();

        // like normal inheritance
        Car c = new SUV(4, "Black", 1.30, 2.3);
        c.autoPilot();

    }
}
