public class Circle {
    private double radius;
    private String color;

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("No radius with negative number");
        }
        this.radius = r;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "radius: " + this.radius + "\ncolor: " + this.color;
    }
}
