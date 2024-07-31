package AElgamal5;

public abstract class HatchbackStreamingService extends HatchbackAutoPilot {

    @Override
    public void streamingService() {
        System.out.println("Hatchback streaming service from HatchbackStreamingService");
    }

    public abstract void parkingSenors();
}
