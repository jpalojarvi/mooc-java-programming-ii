
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> items = new HashMap<>();
    private Map<String, Integer> prices = new HashMap<>();

    public void addProduct(String product, int price, int stock) {
        this.items.put(product, stock);
        this.prices.put(product, price);
    }

    public int price(String product) {
//        if (this.prices.containsKey(product)) {
//            return prices.get(product);
//        }
//        return -99;
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return items.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.items.containsKey(product)) {
            int stock = items.get(product);
            if (stock > 0) {
                stock--;
                this.items.put(product, stock);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        Set<String> names = this.items.keySet();
        return names;
    }
}
