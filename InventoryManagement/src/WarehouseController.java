import java.util.ArrayList;
import java.util.List;

public class WarehouseController {
    private List<Warehouse> warehouses;

    public WarehouseController() {
        warehouses = new ArrayList<>();
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
