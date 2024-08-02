package AElgamal5;

public class CarContainer implements Container<Car> {
    private Car item;

    @Override
    public void add(Car item) {
        this.item = item;
    }

    @Override
    public Car get() {
        return item;
    }
}