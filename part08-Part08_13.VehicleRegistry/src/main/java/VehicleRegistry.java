
import java.util.HashMap;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!vehicleRegistry.keySet().contains(licensePlate)){
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }
    
    public String get(LicensePlate licensePlate){
        if (this.vehicleRegistry.containsKey(licensePlate)){
            return vehicleRegistry.get(licensePlate);
        }
        return null;
    }
    
    public boolean remove(LicensePlate licensePlate){
        if (vehicleRegistry.keySet().contains(licensePlate)){
            this.vehicleRegistry.remove(licensePlate);
            return true;
        }
        return false;
    }
}
