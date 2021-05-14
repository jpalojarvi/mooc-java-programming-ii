
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> contents = new HashMap<>();

    public ShoppingCart() {

    }

    public void add(String product, int price) {
        Item item = new Item(product, 1, price);
        contents.put(product, item);

    }

    public int price() {
        int totalPrice = 0;
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(contents.values());
        for (Item iteratedItem : items) {
            totalPrice += iteratedItem.price();
        }

        return totalPrice;
    }

    public void print() {
        ArrayList<Item> items = new ArrayList<>();
        items.addAll(contents.values());
        for (Item iteratedItem : items){
            System.out.println(iteratedItem);
        }
    }
}
