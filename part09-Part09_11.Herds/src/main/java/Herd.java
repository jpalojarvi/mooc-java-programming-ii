
import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd = new ArrayList<>();

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable iteratedMovable : herd) {
            iteratedMovable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Movable iteratedMovable : herd) {
            output += iteratedMovable + "\n";
        }
        return output;
    }

}
