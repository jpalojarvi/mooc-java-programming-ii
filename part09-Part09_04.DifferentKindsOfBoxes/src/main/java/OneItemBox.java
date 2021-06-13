
import java.util.ArrayList;


public class OneItemBox extends Box {
    private ArrayList<Item> items = new ArrayList<>();

    @Override
    public void add(Item item) {
        if (this.items.isEmpty()){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.items.contains(item)){
            return true;
        }
        return false;
    }

}
