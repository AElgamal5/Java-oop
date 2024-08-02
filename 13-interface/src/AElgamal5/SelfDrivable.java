package AElgamal5;

public interface SelfDrivable {

    public void destination(String d);

    public void drive();

    default void autoPark() {
        System.out.println("Auto Parking");
    }

    public static void hasSelfDrivable() {
        System.out.println("SelfDrivable from static");
    }

    default void speedLimit() {
        System.out.println("SelfDrivable speedLimit");
    }

    private void test() {
        System.out.println("Private method");
    }

    default void defaultMethod() {
        test();
    }

    default void defaultMethod2() {
        test();
    }
}
