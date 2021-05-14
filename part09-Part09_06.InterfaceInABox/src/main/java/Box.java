
import java.util.ArrayList;

public class Box {

    private ArrayList<Packable> items = new ArrayList<>();
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;

    }

    public void add(Packable item) {
        if ((item.weight() + this.weight()) <= this.capacity) {
            this.items.add(item);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

    public double weight() {
        double weight = 0;
        for (Packable iteratedItem : items) {
            weight += iteratedItem.weight();
        }
        return weight;
    }

}
