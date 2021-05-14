
import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    Map<String, Integer> items = new HashMap<>();
    Map<String, Integer> prices = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        this.items.put(product, stock);
        this.prices.put(product, price);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }
}
