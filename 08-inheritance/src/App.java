public class App {
    public static void main(String[] args) {
        /*
         * - Inheritance is a fundamental concept in Object-Oriented Programming (OOP)
         * that allows a new class to inherit properties and behaviors (methods) from an
         * existing class. The existing class is known as the parent class or
         * superclass, and the new class is known as the child class or subclass.
         * Inheritance promotes code reusability and establishes a natural hierarchy
         * between classes.
         * 
         * - Subclass inherit all members (props. methods, nested classes) form
         * superclass.
         * 
         * - Constructors are not members so they are not inherited from superclass but
         * can be invoked by subclass, because any inherited member can be modified.
         * 
         * - By default the default constructor or No-Arg constructor will be invoked.
         * 
         * - Superclass = parent class = base class = general class.
         * 
         * - Subclass = child class = derived class = extended class = specialized
         * class.
         * 
         * - Types of inheritance:
         * 1- Single Inheritance: A class inherits from one superclass.
         * 2- Multilevel Inheritance:A class inherits from another class, which in turn
         * inherits from another class, forming a chain.
         * 3- Hierarchical Inheritance: Multiple classes inherit from a single
         * superclass.
         * 4- Multiple Inheritance: A class inherits from multiple classes. Java does
         * not support multiple inheritance with classes to avoid complexity and
         * ambiguity (diamond problem)
         * 5- Hybrid Inheritance:A combination of two or more types of inheritance.
         * Hybrid inheritance can lead to the diamond problem.
         * 
         * - Diamond problem:The Diamond Problem is an issue that arises in multiple
         * inheritance systems, particularly in object-oriented programming languages
         * that support multiple inheritance directly, such as C++. It occurs when a
         * class inherits from two or more classes that have a common base class,
         * leading to ambiguity in which properties and methods of the base class should
         * be used by the derived class.
         * 
         * - Java avoids the Diamond Problem entirely by not supporting multiple
         * inheritance with classes. Instead, Java uses interfaces to achieve similar
         * functionality without the associated issues.
         * 
         * - Inheritance represent a 'IS-A' relationship aka 'parent-child' relationship
         * 
         * - Access modifiers:
         * ________________________________________
         * |Type_____|Class|Package|Subclass|World|
         * |public___|_Yes_|__Yes__|__Yes___|_Yes_|
         * |protected|_Yes |__Yes__|__Yes___|_No__|
         * |Default__|_Yes_|__Yes__|__No____|_No__|
         * |private__|_Yes_|__No___|__No____|_No__|
         * |______________________________________|
         * 
         * - In class diagram:
         * 1- public => '+'
         * 2- private => '-'
         * 3- protected => '#'
         * 
         * - Super keyword used to call the parent constructor and must be the first
         * statement in child constructor due to high priory.
         * 
         * - By default any class in java extends from built-in class called 'Object'
         * which give any object some methods like:
         * 1- 'obj.toString()': returns package and class name + hash code in hex format
         * which used by JVM to get real address by object using hash algorithm.
         * 2-'obj.hashCode()': returns object address in int format which used by JVM to
         * access object in memory.
         * 3- 'obj.getClass()': return package and class names of object.
         * 4- 
         */

        // -1 Single Inheritance
        // Developer d1 = new Developer();
        // d1.setName("Ahmed");
        // System.out.println(d1.getName());

        // -2 Multilevel Inheritance
        // MobileDeveloper md1 = new MobileDeveloper();

        // -3 using parameterized constructor
        Developer d2 = new Developer("Ahmed", "ahmed@test.com", "0123456", "Eng dep", "Cairo", 2000, "LMS");
        System.out.println(d2);

    }
}
