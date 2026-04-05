public class ProductFactory {
    public Product createProduct(String productType, int productId, String name, int price, int quantity) {
        if(productType.equals("Vegetables"))
            return new Vegetables(productId, name, price, quantity);
        else if(productType.equals("Electronics"))
            return new Electronics(productId, name, price, quantity);
        else
            throw new IllegalArgumentException("Product category does not exist");
    }
}
