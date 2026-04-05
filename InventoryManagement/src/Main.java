public class Main {
    public static void main(String[] args) {
        WarehouseController warehouseController = WarehouseController.getInstance();

        Warehouse warehouse1 = new Warehouse(0);
        Warehouse warehouse2 = new Warehouse(1);

        ProductFactory productFactory = new ProductFactory();

        Product tomato = productFactory.createProduct("Vegetables",0, "Tomato",  10, 20);
        Product onion = productFactory.createProduct("Vegetables", 1,  "Onion", 20, 30);
        Product facewash = productFactory.createProduct("Electronics", 2, "PS5", 50000, 2);

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

        OrderController orderController = new OrderController();

        user1.cart.addProduct(productFactory.createProduct("Vegetables", 0, "Tomato", 10, 2));
        user1.cart.addProduct(productFactory.createProduct("Vegetables", 1, "Onion", 20, 10));
        user1.cart.addProduct(productFactory.createProduct("Electronics", 2, "PS5", 50000, 1));

        user2.cart.addProduct(productFactory.createProduct("Vegetables", 1, "Onion", 20, 20));
        user2.cart.addProduct(productFactory.createProduct("Electronics", 2, "PS5", 50000, 2));

        orderController.createOrder(user1, nearestWarehouse, new CashPayment(), "Bangalore");
        orderController.createOrder(user2, nearestWarehouse, new CardPayment(), "Chennai");
    }
}
