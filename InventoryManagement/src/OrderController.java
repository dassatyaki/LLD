import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderController {
    private Map<Integer, List<Order>> userOrders;

    OrderController() {
        userOrders = new HashMap<>();
    }

    public void createOrder(User user, Warehouse warehouse, PaymentStrategy paymentStrategy, String deliveryAddress) {
        Order newOrder = new Order(deliveryAddress);
        newOrder.placeOrder(user, warehouse, paymentStrategy);

        if(userOrders.containsKey(user.getUserId())) {
            List<Order> orderList = userOrders.get(user.getUserId());
            orderList.add(newOrder);
            userOrders.put(user.getUserId(), orderList);
        }
        else {
            List<Order> orderList = new ArrayList<>();
            orderList.add(newOrder);
            userOrders.put(user.getUserId(), orderList);
        }
    }

    public List<Order> getUserOrders(User user) {
        return userOrders.get(user.getUserId());
    }
}
