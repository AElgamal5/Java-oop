package AElgamal5;

public class App {
    public static void main(String[] args) {
        /*
         * - Final: in OOP is used to indicate that a particular member (variable,
         * method, parameter, or class) cannot be modified after it has been set.
         * 
         * - Final keyword is not access modifier.
         * 
         * - Final variable aka constant variable naming convention to make all char
         * uppercase and separated with '_': ABC_DEF.
         * 
         * - If we create a final var without initialized called 'blank final var'.
         * 
         * - Final methods can't be overridden by child class.
         * 
         * - Final class can't be inherited aka extended by any class.
         * 
         * - Final reference treated as regular final var.
         * 
         * - In java final ref can use all methods regular and final.
         * 
         * - Final var which created inside method called local final var.
         * 
         * - Local final vars are faster x2.5 times that regular vars.
         * 
         * - Final classes can used to save constants of your app.
         * 
         * - Summary:
         * 1- Final with vars: stops value change
         * 2- Final with methods: stops overriding
         * 3- Final with class: stops inheritance
         */

        // 1- final variable:
        final double PI = 3.14;
        // PI = 3.15; //error can't update a final variable
        System.out.println("PI = " + PI);
        Student s1 = new Student(123, "Ahmed", 2018);
        Student s2 = new Student(456, "Amir", 2018);
        System.out.println(s1.ID);
        // s1.ID = 456; //error can't update a final variable
        System.out.println(Student.SUCCESS_DEGREE);

        // 2- final reference
        final Student s = new Student(123, "Ahmed", 2018);
        // s = new Student(123, "Ahmed", 2018); //error can't update a final reference
    }
}
