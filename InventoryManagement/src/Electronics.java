public class Electronics implements Product{
    private int productId;
    private String name;
    private int price;
    private int quantity;

    Electronics(int productId, String name, int price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int getProductId() {
        return productId;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
