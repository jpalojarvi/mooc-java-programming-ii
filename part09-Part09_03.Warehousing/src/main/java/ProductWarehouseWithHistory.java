
import java.util.ArrayList;


public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.addToWarehouse(initialBalance);
        changeHistory.add(initialBalance);
    }
    
    public String history(){
        return this.changeHistory + "";
    }
    
}
