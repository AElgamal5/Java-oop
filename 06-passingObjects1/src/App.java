
public class App {
    public static void main(String[] args) {
        /*
         * All primitive data types only passed by value.
         * 
         * No pointer in java.
         * 
         * But we can pass object by value and we can create a wrap class to that
         * primitive data types
         */
        int num1 = 1;
        App.increment(num1);
        System.out.println("Pass by value: " + num1); // still 1

        IntWrap num2 = new IntWrap(1);
        App.increment(num2);
        System.out.println("Pass by reference using wrap: " + num2.value);
    }

    private static void increment(int num) {
        num++;
    }

    private static void increment(IntWrap num) {
        num.value++;
    }
}
