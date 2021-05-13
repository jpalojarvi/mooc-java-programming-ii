
import java.util.ArrayList;


public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.addToWarehouse(initialBalance);
    }
    
    public String history(){
        return this.changeHistory + "";
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(this.getBalance());
        return amountTaken;
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
    
}
