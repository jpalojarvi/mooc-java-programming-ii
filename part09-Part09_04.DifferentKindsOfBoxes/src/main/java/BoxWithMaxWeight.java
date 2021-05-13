
public class BoxWithMaxWeight extends Box {

    private int capacity;

    public BoxWithMaxWeight(int capacity) {

        this.capacity = capacity;
    }

    public int calculateCurrentWeight() {
        int currentWeight = 0;
        for (Item iteratedItem : items) {
            currentWeight += iteratedItem.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() + this.calculateCurrentWeight() <= this.capacity) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (super.items.contains(item)) {
            return true;
        }
        return false;
    }

}
