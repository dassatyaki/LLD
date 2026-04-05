import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> cartList;

    public Cart() {
        cartList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartList.add(product);
    }

    public void removeProduct(Product product) {
        cartList.remove(product);
    }

    public void clearCart() {
        cartList.clear();
    }

    public List<Product> getCartList() {
        return cartList;
    }
}
