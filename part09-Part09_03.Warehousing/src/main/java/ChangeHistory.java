
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory = new ArrayList<>();
    

    public ChangeHistory() {
        
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }

}
