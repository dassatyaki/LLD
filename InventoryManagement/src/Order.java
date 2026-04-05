import java.util.List;

public class Order {
    private String deliveryAddress;
    private OrderStatus status;

    public Order(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        status = OrderStatus.NOT_DELIVERED;
    }

    public void setOrderStatus(OrderStatus status) {
        this.status = status;
    }

    public void placeOrder(User user, Warehouse warehouse, PaymentStrategy paymentStrategy) {
        int total = 0;
        Inventory inventory = warehouse.getInventory();
        Cart cart = user.getCart();
        List<Product> cartList = cart.getCartList();

        for(Product product : cartList) {
            boolean isAvailable = inventory.removeProduct(product);

            if(isAvailable) {
                total += product.getPrice() * product.getQuantity();
            }
        }

        cart.clearCart();

        if(total > 0) {
            paymentStrategy.makePayment(total);
            setOrderStatus(OrderStatus.DELIVERED);
            System.out.println("Order is delivered to " + deliveryAddress);
        }
    }
}
