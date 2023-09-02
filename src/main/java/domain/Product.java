package domain;

public class Product extends Entity {
    protected String sku;
    protected String description;
    protected double price;
    protected double tax;

    public Product(int id, String sku, String description, double price, double tax) {
        super(id);
        this.sku = sku;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product | " +
                "sku - " + sku +
                ", description - " + description +
                ", price - " + price +
                ", tax - " + tax;
    }
}
