public class App {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.setRadius(1.5);
        c1.setColor("RED");

        System.out.println(c1);
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        Account a1 = new Account();
        a1.insert(1, "Ahmed", 123.456f);
        System.out.println(a1);
    }
}
