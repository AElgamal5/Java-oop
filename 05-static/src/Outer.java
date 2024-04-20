public class Outer {
    private static String outerMessage = "Hello from Outer";

    public static class StaticNestedClass {
        public void printMessage() {
            System.out.println(outerMessage);
        }
    }

    public static void main(String[] args) {
        Outer.StaticNestedClass nestedObject = new Outer.StaticNestedClass();
        nestedObject.printMessage();
    }
}