package AElgamal5;

public class App {
    public static void main(String[] args) {
        /*
         * - Interface is blueprint or a template of a class and provide pure
         * abstraction specially in old java versions.
         * 
         * - An interface in OOP is a contract that specifies what methods a class must
         * implement without dictating how these methods should be implemented.
         * 
         * - Advantages of using interfaces:
         * 1- Decoupling
         * 2- Multiple inheritance
         * 3- Polymorphism
         * 4- Testability
         * 
         * - 'implements' keyword used when class use an interface but we use 'extends'
         * between interfaces.
         * 
         * - Realization: is a relation between the blueprint class and the object aka
         * concrete class containing its respective implementation level details.
         * 
         * - In java naming convention for interfaces can be:
         * 1- End with 'able' like 'Swimmable'.
         * 2- start with 'can' 'CanSwim'.
         * 
         * - Any prop declared in an interface by default be: 'public static final'
         * 
         * - Any method declared in an interface by default be: 'public abstract'
         * 
         * - Which java types can implement interfaces:
         * 1- Class
         * 2- Abstract class
         * 3- Nested class
         * 4- Enum
         * 5- Dynamic proxy
         * 
         * - Differences Between Abstract Classes and Interfaces:
         * 1- Default aka concrete methods:
         * a- Abstract class: Can have concrete methods.
         * b- Interface: Methods are abstract by default (Java 8 onwards allows default
         * methods).
         * 
         * 2- Fields:
         * a- Abstract class: Can have instance variables.
         * b- Interface: Can only have static final variables (constants).
         * 
         * 3- Constructors:
         * a- Abstract class: Can have constructors.
         * b- Interface: Cannot have constructors.
         * 
         * 4- Inheritance:
         * a- Abstract class: A class can extend only one abstract class.
         * b- Interface: A class can implement multiple interfaces.
         * 
         * 4- Use case:
         * a- Abstract class: When classes share a common base and behavior.
         * b- Interface: When classes share common behavior but not a common base.
         * 
         * 
         * - After java SE:7 we can define concrete function in the interface using
         * 'default' keyword so that now interfaces doesn't provide a pure abstraction.
         * 
         * - we can use 'default' to add a method that represent a new feature appear
         * during developing, before 'default' we would create a new interface that have
         * that new feature and new class that inherit form the original class and
         * implement the new interface.
         * 
         * - Default methods can be overridden in the implemented class.
         * 
         * - Default methods must be public.
         * 
         * - Default methods can't be with the same signature even it's in different
         * interfaces if one class implement those interfaces:
         * interface one{
         * void fun();
         * }
         * interface two{
         * void fun();
         * }
         * class class implements one,two{} // error
         * 
         * - Interface can have a static methods.
         * 
         * - If there is interface has a method called test() and there is class has the
         * same function with the same signature then a new class extends the class and
         * the interface, the parent class method will be called.
         *
         * - 
         */

        Car c1 = new Car();
        c1.position();
        c1.moveUp();
        c1.moveUp();
        c1.moveRight();
        c1.position();
        c1.moveLeft();
        c1.position();
        c1.autoPark();
        SelfDrivable.hasSelfDrivable();
    }
}
