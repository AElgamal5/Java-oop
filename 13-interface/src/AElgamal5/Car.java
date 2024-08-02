package AElgamal5;

public class Car extends Speed
        implements Movable, SelfDrivable, CanLight, CanLight.CanLightBack, CanLight.CanLightFront, CanHorn, Marker {
    private int x;
    private int y;
    private int noOfSeats;

    public Car() {
        this.x = 0;
        this.y = 0;
        this.noOfSeats = 4;
    }

    public Car(int x, int y, int noOfSeats) {
        this.x = x;
        this.y = y;
        this.noOfSeats = noOfSeats;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getNoOfSeats() {
        return this.noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public void destination(String d) {
        System.out.println("Destination = " + d);
    }

    @Override
    public void drive() {
        System.out.println("Drive");
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }

    public void position() {
        System.out.println("(x= " + this.x + " , y= " + this.y + ")");
    }

    @Override
    public void autoPark() {
        System.out.println("Auto Parking from car class");
    }

    @Override
    public String toString() {
        return "Car [x=" + x + ", y=" + y + ", noOfSeats=" + noOfSeats + "]";
    }

    @Override
    public void light() {
        System.out.println("Car light");
    }

    @Override
    public void frontLight() {
        System.out.println("Car frontLight");
    }

    @Override
    public void backLight() {
        System.out.println("Car backLight");
    }

    @Override
    public void horn() {
        System.out.println("beep beep");
    }
}