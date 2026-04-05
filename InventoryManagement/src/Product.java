public class Product {
    private int productId;
    private String name;
    private String category;
    private int price;
    private int quantity;

    Product(int productId, String name, String category, int price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    int getProductId() {
        return productId;
    }

    int getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    String getName() {
        return name;
    }

    String getCategory() {
        return category;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
