
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageFacility;

    public StorageFacility() {
        this.storageFacility = new HashMap<>();
    }

    public void add(String unit, String item) {
        // an empty list has to be added for a new unit if one has not already been added
        this.storageFacility.putIfAbsent(unit, new ArrayList());

        // let's first retrieve the list containing the items and add to it
//         ArrayList<String> itemList = this.storageFacility.get(unit);
//         itemList.add(item);
        // the previous would also work without the helper variable as follows
        this.storageFacility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return storageFacility.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String unit, String item) {
        this.storageFacility.get(unit).remove(item);
        if (this.storageFacility.get(unit).isEmpty()){
            this.storageFacility.remove(unit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitList = new ArrayList<>(storageFacility.keySet());
        return unitList;
    }
}
