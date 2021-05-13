
import java.util.ArrayList;


public class ProductWarehouseWithHistory extends ProductWarehouse {
    private double initialBalance;
    private ChangeHistory changeHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.initialBalance = initialBalance;
    }
    
    public String history(){
        return this.changeHistory + "";
    }
    
}
