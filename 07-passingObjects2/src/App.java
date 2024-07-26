
public class App {
    public static void main(String[] args) {
        /*
         * In java operator overloading not supported but we can workaround using
         * method that do the same functionality.
         * 
         * ---------------------------------
         * Class obj1 = new Class();
         * Class obj2 = new Class();
         * obj1 = obj2; //now obj1 and obj2 has the same value or address to obj2 in the
         * heap
         * so any update from obj1 will be the same as from obj2
         * obj1.value = 5;
         * obj.value => equal 5
         */

        int num1 = 5;
        int num2 = 3;
        int sum = App.add(num1, num2);
        System.out.println("Sum = " + sum);

        // add two complex numbers
        ComplexNumber com1 = new ComplexNumber(1, 2);
        ComplexNumber com2 = new ComplexNumber(3, 4);
        ComplexNumber objSum = com1.add(com2);
        System.out.println(objSum);

        System.out.println("-".repeat(20));
        // or
        objSum = ComplexNumber.add(com1, com2);
        System.out.println(objSum);

        System.out.println("-".repeat(20));
        // check if two complex numbers are equals
        if (com1.equal(com2)) {
            System.out.println("com == com2");
        } else {
            System.out.println("com != com2");
        }
        System.out.println("-".repeat(20));
        // or
        if (ComplexNumber.equal(com1, com2)) {
            System.out.println("com == com2");
        } else {
            System.out.println("com != com2");
        }
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
