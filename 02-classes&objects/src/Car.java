public class Car {
    private String name;
    private int year;
    private double price;
    private boolean state = false;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(int year) {
        if (year > 2000) {
            System.out.println("Sorry, we like classic cars");
            return;
        }
        this.year = year;
    }

    public int getYear() {
        if (this.year == 0) {
            System.out.println("No year for this car");
            return -1;
        }
        return this.year;
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }
}
