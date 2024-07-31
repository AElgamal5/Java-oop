package AElgamal5;

public abstract class HatchbackAutoPilot extends Car {

    @Override
    public void autoPilot() {
        System.out.println("Hatchback auto pilot from HatchbackAutoPilot");
    }

    public abstract void streamingService();

    public abstract void parkingSenors(); 
}
