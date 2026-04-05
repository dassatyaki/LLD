import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> productList;

    public Inventory() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {

        for(Product prod : productList) {
           if(product.equals(prod)) {
               prod.setQuantity(product.getQuantity() + prod.getQuantity());
               return;
           }
        }

        productList.add(product);
    }

    public boolean removeProduct(Product product) {

        for (Product prod: productList) {
            if (product.getProductId() == prod.getProductId()) {
                if(product.getQuantity() > prod.getQuantity()) {
                    System.out.println("Product quantity of " + product.getName() + " not available in inventory");
                    return false;
                }
                else if(product.getQuantity() < prod.getQuantity()) {
                    prod.setQuantity(prod.getQuantity() - product.getQuantity());
                }
                else {
                    productList.remove(product);
                }
                System.out.println("Product " + product.getName() + " of quantity " + product.getQuantity() + " purchased");
                return true;
            }
        }

        System.out.println("Product " + product.getName() + " not available");
        return false;
    }
}
