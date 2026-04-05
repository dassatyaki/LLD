public class Main {
    public static void main(String[] args) {
        WarehouseController warehouseController = new WarehouseController();

        Warehouse warehouse1 = new Warehouse(0);
        Warehouse warehouse2 = new Warehouse(1);

        Product tomato = new Product(0, "Tomato", "Vegetables", 10, 20);
        Product onion = new Product(1, "Onion", "Vegetables", 20, 30);
        Product facewash = new Product(0, "Facewash", "Hygiene", 100, 5);

        warehouse1.addProduct(tomato);
        warehouse1.addProduct(onion);
        warehouse1.addProduct(facewash);

        warehouseController.addWarehouse(warehouse1);
        warehouseController.addWarehouse(warehouse2);

        WarehouseSelectionStrategy warehouseSelectionStrategy = new NearestWarehouseSelectionStrategy();
        Warehouse nearestWarehouse = warehouseSelectionStrategy.selectWarehouse(warehouseController.getWarehouses());

        UserController userController = new UserController();
        User user1 = new User(0);
        User user2 = new User(1);
        userController.addUser(user1);
        userController.addUser(user2);

        user1.cart.addProduct(new Product(0, "Tomato", "Vegetables", 10, 2));
        user1.cart.addProduct(new Product(1, "Onion", "Vegetables", 10, 40));
        user1.cart.addProduct(new Product(2, "Cauliflower", "Vegetables", 20, 1));

        user2.cart.addProduct(new Product(0, "Tomato", "Vegetables", 10, 25));
        user2.cart.addProduct(new Product(1, "Onion", "Vegetables", 10, 10));

        OrderController orderController = new OrderController();
        orderController.createOrder(user1, nearestWarehouse, new CashPayment(), "Bangalore");
        orderController.createOrder(user2, nearestWarehouse, new CardPayment(), "Chennai");
    }
}
