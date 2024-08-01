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
}
