public class Warehouse {
    private Inventory inventory;
    int warehouseId;

    public Warehouse(int warehouseId) {
        this.warehouseId = warehouseId;
        inventory = new Inventory();
    }

    public void addProduct(Product product){
        inventory.addProduct(product);
    }

    public void removeProduct(Product product){
        inventory.removeProduct(product);
    }

    public Inventory getInventory() {
        return inventory;
    }
}
