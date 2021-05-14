
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> contents = new HashMap<>();

    public ShoppingCart() {

    }

    public void add(String product, int price) {
        if (contents.containsKey(product)) {
            Item item = contents.get(product);
            item.increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            contents.put(product, item);
        }
    }
    // Model solution
//        public void add(String product, int price) {
//        this.items.putIfAbsent(product, new Item(product, 0, price));
//        this.items.get(product).increaseQuantity();
//    }

    public int price() {
        int totalPrice = 0;
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(contents.values());
        for (Item iteratedItem : items) {
            totalPrice += iteratedItem.price();
        }

        return totalPrice;
    }
    // Model solution
//        public int price() {
//        int sum = 0;
//        for (Item item : this.items.values()) {
//            sum = sum + item.price();
//        }
//        return sum;
//    }

    public void print() {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(contents.values());
        for (Item iteratedItem : items) {
            System.out.println(iteratedItem);
        }
    }
}
