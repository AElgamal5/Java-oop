package AElgamal5;

public class SUV extends Car {
    private int noOfSeats;

    public SUV(int noOfSeats, String color, double height, double weight) {
        super(color, weight, height);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public void autoPilot() {
        System.out.println("SUV auto pilot.");
    }

    @Override
    public void streamingService() {
        System.out.println("SUV streaming service.");
    }

    @Override
    public void parkingSenors() {
        System.out.println("SUV parking senors.");
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int setNoOfSeats() {
        return this.noOfSeats;
    }
}
