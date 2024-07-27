public class App {
    public static void main(String[] args) {
        /*
         * Polymorphism: is derived form 2 words
         * - poly = many
         * - morphs = forms
         * 
         * - Polymorphism refers to the use of single type entity(method, operator,
         * object) to represent to represent different operations (types) in different
         * scenarios.
         * 
         * - We can achieve polymorphism by use:
         * 1- method overloading: compile time polymorphism, static polymorphism, or
         * early binding.
         * 2- method overriding: runtime polymorphism, dynamic method despatching, or
         * late binding.
         * 
         * - Compile-Time Polymorphism (Static Polymorphism):
         * 1- This is achieved through method overloading.
         * 2- Method overloading occurs when multiple methods in the same class have the
         * same name but different parameters (different type, number, or both)
         * different signature.
         * 3- The determination of which method to call is made at compile time.
         * 
         * - Run-Time Polymorphism (Dynamic Polymorphism):
         * 1- This is achieved through method overriding.
         * 2- Method overriding occurs when a subclass provides a specific
         * implementation of a method that is already defined in its superclass.
         * 3- The determination of which method to call is made at runtime, depending on
         * the actual object's type that is being referenced.
         * 
         * - Rules for overriding:
         * 1- There must an IS-A relationship aka inheritance.
         * 2- The method must be the same signature as in parent class.
         * 
         * - Upcasting refers to casting a subclass object to a superclass
         * type. This is done implicitly and allows you to use a subclass object where a
         * superclass object is expected.
         * In the example: Parent obj = new Child().
         * We can use any member that exists in the parent class and give priority to
         * the overriding member except static methods if it exists, and if it does not
         * exist in the parent it won't be accessed.
         * 
         * - Can't add '@Override' notation on static method in child class.
         * 
         * - we can reference child form parent class and not vice versa:
         * Parent obj = new Child();
         * Child obj = new Parent(); //error
         * 
         * - With polymorphism we can achieve polymorphic aka generic array type:
         * array that can accept different datatypes.
         */

        // 1- use getSalary() in each employee type
        // Employee e1 = new Employee("Ahmed", "Alex", "Backend", "ahmed@test.com",
        // 400);
        // SalariedEmployee e2 = new SalariedEmployee("Amir", "Alex", "Frontend",
        // "Amir@test.com", 400, 50);
        // DailyEmployee e3 = new DailyEmployee("Samir", "Alex", "Frontend",
        // "Samir@test.com", 400, 8, 5);
        // HourlyEmployee e4 = new HourlyEmployee("Khaled", "Alex", "Frontend",
        // "Khaled@test.com", 400, 8, 3);

        // System.out.println("Employee salary = " + e1.getSalary());
        // System.out.println("SalariedEmployee salary = " + e2.getSalary());
        // System.out.println("DailyEmployee salary = " + e3.getSalary());
        // System.out.println("HourlyEmployee salary = " + e4.getSalary());

        // 2- Upcasting
        // Employee emp = new SalariedEmployee("Amir", "Alex", "Frontend",
        // "Amir@test.com", 400, 50);
        // System.out.println(emp.getSalary()); // user overriding one exists in
        // SalariedEmployee
        // System.out.println(emp.getBonus());//can't get method doesn't exist in parent

        // 3- static override ?
        // Employee.print();
        // SalariedEmployee.print();
        // Employee e1 = new SalariedEmployee("Amir", "Alex", "Frontend",
        // "Amir@test.com", 400, 50);
        // e1.print(); // as parent class

        // 4- polymorphic aka generic array type
        Employee[] emps = new Employee[4];

        emps[0] = new Employee(null, null, null, null, 0);
        emps[1] = new SalariedEmployee(null, null, null, null, 0, 0);
        emps[2] = new DailyEmployee(null, null, null, null, 0, 0, 0);
        emps[3] = new HourlyEmployee(null, null, null, null, 0, 0, 0);
    }

    // overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }
}
