
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
    
    public double maxValue(){
        double maxValue = 0.0;
        for (Double iteratedChange : changeHistory){
            if (iteratedChange > maxValue){
                maxValue = iteratedChange;
            }
        }
        return maxValue;
    }

    public double minValue(){
        double minValue = changeHistory.get(0);
        for (Double iteratedChange : changeHistory){
            if (iteratedChange < minValue){
                minValue = iteratedChange;
            }
        }
        return minValue;
    }
    
    public double average(){
        double average = 0.0;
        double sum = 0.0;
        int count = 0;
        for (Double iteratedChange : changeHistory){
            sum += iteratedChange;
            count++;
        }
        average = sum/count;
        return average;
    }
    
}
