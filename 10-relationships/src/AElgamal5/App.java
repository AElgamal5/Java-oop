package AElgamal5;

public class App {
    public static void main(String[] args) {
        /*
         * - Types of relations in OOP:
         * 1-Inheritance "IS-A" relationship.
         * 2-Association "HAS-A" relationship.
         * 3-Composition "PART-OF" relationship.
         * 4-Aggregation "HAS-A" relationship.
         * 
         * - Inheritance: This is a relationship where one class (subclass/child class)
         * inherits the properties and behaviors of another class (superclass/parent
         * class).
         * - Used to create a hierarchical classification and to enable code reuse.
         * 
         * - Association:This is a relationship where all objects have their own
         * lifecycle and there is no owner. It represents a "uses-a" relationship also.
         * - Types of Association:
         * 1- Unidirectional Association: One class is aware of the other class.
         * 2- Bidirectional Association: Both classes are aware of each other.
         * 
         * - Aggregation: This is a specialized form of Association where all objects
         * have their own lifecycle but there is ownership, and the child can exist
         * independently of the parent, It represents a "whole-part" relationship also.
         * 
         * - Composition: This is a more restrictive form of Aggregation where the child
         * cannot exist independently of the parent. If the parent is destroyed, so are
         * the children, It represents a "part-of" relationship also.
         * 
         * - Aggregation and composition are indeed specialized forms of unidirectional
         * association:
         * - Aggregation: The part can exist independently.
         * - Composition: The part cannot exist independently
         * 
         * - Summary
         * 1- Inheritance: "IS-A" relationship, represents a hierarchical relationship.
         * 2- Association: General relationship, "uses-a".
         * - Unidirectional: One class knows about the other.
         * - Bidirectional: Both classes know about each other.
         * 3- Aggregation: "HAS-A" relationship, represents a "whole-part" relationship
         * where the child can exist independently.
         * 4- Composition: Strong "HAS-A" relationship, represents a "part-of"
         * relationship where the child cannot exist independently
         */

        Department d1 = new Department(1, "Eng");
        Employee e1 = new Employee(123, 400, "Ahmed", "A.", "Elgamal", "AB+", "123456879", "Egyptian", 2000, d1);
        Project p1 = new Project(456, "XYZ");

        e1.work(p1);
    }
}
