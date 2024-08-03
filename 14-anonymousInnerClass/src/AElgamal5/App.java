package AElgamal5;

import AElgamal5.Showable;

public class App {
    public static void main(String[] args) {
        /*
         * - Anonymous inner class in Java is a class that is defined and instantiated
         * all at once, without explicitly declaring a separate class.
         * 
         * - Characteristics of Anonymous Inner Classes:
         * 1- No Explicit Name aka nameless
         * 2- One-Time Use
         * 3- Limited to a Single Instance
         * 4- Can extend abstract and concrete or Implement an interface
         * 5- Access to Enclosing Class Members
         * 
         * - Limitations of Anonymous Inner Classes:
         * 1- Cannot Define Constructors: Since they do not have a name, they cannot
         * define constructors. You can only use instance initializer block.
         * 2- Complexity: They can make the code harder to read and understand,
         * especially if overused or used for complex implementations.
         * 3-Single Implementation: They are best suited for scenarios where a single
         * instance is needed, as defining multiple anonymous inner classes can lead to
         * code duplication and reduced maintainability.
         * 
         * - Java compiler gives the anonymous inner class a unique name, which is
         * typically a number. This unique name allows Java to distinguish between
         * different instances of the same anonymous inner class.
         * 
         * - We can use lambda expressions to replace the anonymous inner class
         * implementation with interface in only got one method or functional interface.
         * 
         * - Anonymous inner class can be sent as an argument to a method or can be
         * returned from a method.
         * 
         * - Initializer blocks run before the constructs if they all in the same class
         * but if theres is a parent class so the constructor fo the parent class will
         * run first.
         * 
         * - We can create additional method or props inside anonymous inner class using
         * 'var' keyword.
         * 
         * - The var keyword in Java is used to declare local variables with inferred
         * types.
         * 
         * - 'var' keyword limitations:
         * 1- It can only be used for local variables.
         * 2- It cannot be used for without initialization or with null.
         * 3- It cannot be used for instance variables.
         * 4- It cannot be used for method parameters.
         * 4- It cannot be used with generics.
         * 4- It cannot be used with lambda expressions.
         * 
         * - In anonymous inner class we can access the members of the outer class
         * directly without creating an object of the outer class but without updating.
         * 
         * - In anonymous inner class we can create static member only with 'final'
         * keyword.
         */

        // example of anonymous inner class
        Gift g1 = new Gift();
        Gift g2 = new Gift() {
            @Override
            public void reward() {
                System.out.println("You get a 20$");
            }
        };
        Gift g3 = new Gift() {
            @Override
            public void reward() {
                System.out.println("You get a 30$");
            }
        };
        g1.reward();
        g2.reward();
        g3.reward();
        System.out.println("-".repeat(20));

        // anonymous inner class names
        System.out.println(g1.getClass()); // output: class AElgamal5.Gift
        System.out.println(g2.getClass()); // output: class AElgamal5.App$1
        System.out.println(g3.getClass()); // output: class AElgamal5.App$1
        System.out.println("-".repeat(20));

        // create anonymous inner class object at the same time
        new Gift() {
            @Override
            public void reward() {
                System.out.println("You get a 40$");
            }
        }.reward();
        System.out.println("-".repeat(20));

        // use anonymous inner class with interface
        Showable showable = new Showable() {
            @Override
            public void show() {
                System.out.println("Show 1");
            }
        };
        showable.show();
        // without creating a ref
        new Showable() {
            @Override
            public void show() {
                System.out.println("Show 2");
            }
        }.show();
        System.out.println("-".repeat(20));

        // using lambda expression
        Showable sh2 = () -> System.out.println("Show 3");
        sh2.show();
        System.out.println("-".repeat(20));

        // send as a parameter
        show(new Showable() {
            @Override
            public void show() {
                System.out.println("Show 4");
            }
        });
        System.out.println("-".repeat(20));

        // initializer blocks

        Test test = new Test() {
            {
                System.out.println("Initializer block");
            }

            @Override
            public void test() {
                System.out.println("Test override");
            }
        };
        test.test();
        System.out.println("-".repeat(20));

        // using var keyword
        var test2 = new Test() {
            public int x = 10;

            {
                System.out.println("Initializer block");
            }

            @Override
            public void test() {
                System.out.println("Test override");
            }

            public void test2() {
                System.out.println("Test 2");
            }
        };
        test2.test();
        test2.test2();
        System.out.println("x = " + test2.x);
        System.out.println("-".repeat(20));

        // access a prop from outside
        int x = 10;
        new Test() {
            @Override
            public void test() {
                int y = 20;
                // x = 5; // error
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }
        }.test();
        System.out.println("-".repeat(20));

        // anonymous inner class with static member
        var test3 = new Test() {
            static final int x = 10;

            @Override
            public void test() {
                System.out.println("x = " + x);
            }

            public static final void test2() {
                System.out.println("Static Test 2");
            }
        };

        System.out.println(test3.x);
        test3.test();
        test3.test2();

    }

    public static void show(Showable sh) {
        sh.show();
    }
}
