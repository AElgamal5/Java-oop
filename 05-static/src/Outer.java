public class Outer {
    private static String outerMessage = "Hello from Outer";
    private String outerMessage2 = "Hello from Outer 2";

    public static class Inner {
        private static int x = 5;
        private int y = 3;

        public void printMessage() {
            System.out.println("From inner class");
            System.out.println(outerMessage);
            // System.out.println(outerMessage2); // only use static member form outer class

            System.out.println(Inner.x);
            System.out.println(this.y);
        }

        public static void printMessage2() {
            System.out.println("From inner class");
            System.out.println(outerMessage);
            // System.out.println(outerMessage2); // only use static member form outer class

            System.out.println(Inner.x);
            // System.out.println(this.y); non-static variable this cannot be referenced
            // from a static context
        }
    }

    public static void main(String[] args) {
        Outer.Inner nestedObject = new Outer.Inner();
        nestedObject.printMessage();

        Outer.Inner.printMessage2();
    }
}