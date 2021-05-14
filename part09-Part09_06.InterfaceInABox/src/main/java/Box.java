
import java.util.ArrayList;

public class Box {

    private ArrayList<Packable> items = new ArrayList<>();
    private double currentWeight;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;

    }

    public void add(Packable item) {
        if ((item.weight() + this.currentWeight) <= this.capacity){
            this.items.add(item);
            this.currentWeight += item.weight();
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.currentWeight + " kg";
    }
    
    
}
