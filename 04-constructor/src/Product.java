public class Product {
    private String name;
    private double price;
    private double discount;
    private int quantity;
    private String description;
    private String color;

    public Product() {
        this.name = "No name";
        this.description = "No description";
        this.price = 0.0;
        this.discount = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price, double discount, int quantity, String description) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.description = description;
    }

    public Product(String name, double price, double discount, int quantity, String description, String color) {
        this(name, price, discount, quantity, description);
        this.color = color;
    }

    public Product(Product product) {
        this(
                product.name,
                product.price,
                product.discount,
                product.quantity,
                product.description,
                product.color);
    }

    public void display() {
        System.out.println("name: " + this.name);
        System.out.println("price: " + this.price);
        System.out.println("discount: " + this.discount);
        System.out.println("quantity: " + this.quantity);
        System.out.println("description: " + this.description);
        System.out.println("color: " + this.color);
    }
}
