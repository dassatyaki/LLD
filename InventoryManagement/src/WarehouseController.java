import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    private List<Warehouse> warehouses;
    private static volatile WarehouseController warehouseController;

    private WarehouseController() {
        warehouses = new ArrayList<>();
    }

    public static WarehouseController getInstance() {
        if(warehouseController == null) {
            synchronized (WarehouseController.class){
                if(warehouseController == null) {
                    warehouseController = new WarehouseController();
                }
            }
        }
        return warehouseController;
    }

    public void addWarehouse(Warehouse warehouse) {
        warehouses.add(warehouse);
    }

    public void removeWarehouse(Warehouse warehouse) {
        warehouses.remove(warehouse);
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }
}
