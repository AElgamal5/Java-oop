public class App {
    public static void main(String[] args) {
        /*
         * create a class for car:
         * -props:
         * name=>string
         * price=>double
         * year=>int
         * state=>booleans
         * -methods:
         * turnOn=>void
         * turnOff=>void
         * move=>void
         * 
         * 
         * setters aka mutators for example: setName() or setYear()
         * getters aka accessors for example: getName() or getYear()
         * 
         * Access modifiers:
         * 1. public: can be accessed from any where
         * 2. private: only accessed with the class
         * 3. protected: accessed with the class and inherited ones from it
         * 
         * 
         * Data hiding:
         * is a software development technique used in OOP to hide internal,
         * data hiding ensures exclusive data access to class members and protect object
         * integrity by preventing unintended or intended changes.
         * 
         * Encapsulation in Object-Oriented Programming (OOP) is the bundling of data
         * (attributes) and the methods (functions) that operate on that data into a
         * single unit, called a class. It is one of the fundamental principles of OOP
         * and is used to create objects that encapsulate data and behavior, providing a
         * way to control access to the data (Data hiding).
         */

        Car c1 = new Car();
        // c1.name = "BMW";
        // c1.year = 2020;
        // c1.price = 12345.789;

        // System.out.println(c1.name);
        // System.out.println(c1.year);
        // System.out.println(c1.price);
        // System.out.println(c1.state);

        Car c2 = new Car();
        // System.out.println(c2.name);
        // System.out.println(c2.year);
        // System.out.println(c2.price);
        // System.out.println(c2.state);

        System.out.println(c2.getYear());
        c2.setYear(2005);
        c2.setYear(1968);
        System.out.println(c2.getYear());
    }
}
