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
         * 5- Security
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
         * interfaces if one class implement those interfaces unless its overridden:
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
         * - In java 9 we can define private non-abstract methods in interfaces and used
         * be default method to achieve:
         * 1- code reusability
         * 2- encapsulation
         * 
         * - Private methods can be both instance methods or static methods, depending
         * on whether you need to access instance-specific data or class-level data.
         * 
         * - Functional interface aka Single Abstract Method (SAM) interface in Java
         * is an interface that has exactly one abstract method.
         * 
         * - Functional interface use '@FunctionalInterface' annotation to enforce the
         * rule that an interface must have exactly one abstract method.
         * 
         * - Marker interface or tagging interface: is a design pattern that provides
         * metadata to a class to indicate that the class possesses some special
         * property or behavior.
         * 
         * - Marker interface does not contain any methods or fields. Instead, it
         * serves as a way to associate metadata with a class.
         * 
         * - Marker interface are used to mark a class as supporting a particular
         * capability or role like:
         * 1- Serializable
         * 2- Cloneable
         * 3- Remote
         * 
         * - Generic interface in Java is an interface that uses Java generics to allow
         * types to be parameterized. This means that when you define a generic
         * interface, you can specify one or more type parameters. When you implement or
         * use the interface, you can specify the actual types for those parameters.
         * 
         * - To define a generic interface, you use angle brackets (<>) to specify type
         * parameters.
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
        System.out.println("-".repeat(10));

        // static method form interface
        SelfDrivable.hasSelfDrivable();
        System.out.println("-".repeat(10));

        // priority to parent class
        c1.speedLimit();
        System.out.println("-".repeat(10));

        // use private method from interface through default methods
        c1.defaultMethod();
        c1.defaultMethod2();
        System.out.println("-".repeat(10));

        // use nested interface
        c1.light();
        c1.frontLight();
        c1.backLight();
        System.out.println("-".repeat(10));

        // use functional interface
        c1.horn();
        System.out.println("-".repeat(10));

        // use maker interface
        if (c1 instanceof Marker)
            System.out.println("Car implements Marker interface");
        else
            System.out.println("Car doesn't implement Marker interface");

        if (c1 instanceof Cloneable)
            System.out.println("Car implements Cloneable interface");
        else
            System.out.println("Car doesn't implement Cloneable interface");

        System.out.println("-".repeat(10));

        // use generic interface
        CarContainer cc1 = new CarContainer();
        cc1.add(c1);
        System.out.println(cc1.get());
    }
}
