import java.util.List;

public class NearestWarehouseSelectionStrategy implements WarehouseSelectionStrategy{
    public Warehouse selectWarehouse(List<Warehouse> warehouses) {
        return warehouses.get(0);
    }
}
