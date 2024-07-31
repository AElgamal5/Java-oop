package AElgamal5;

public abstract class Car {
    String color;
    double weight;
    double height;

    protected Car() {
    }

    protected Car(String color, double weight, double height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public abstract void autoPilot();

    public abstract void streamingService();

    public abstract void parkingSenors();

    public static void startEngin() {
        System.out.println("Car engin started");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
