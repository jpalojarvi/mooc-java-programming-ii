
import java.util.ArrayList;

public class Hideout<T> {

    ArrayList<T> hideOut = new ArrayList<>();

    public void putIntoHideout(T toHide) {
        if (this.hideOut.isEmpty()) {
            this.hideOut.add(toHide);
        } else {
            this.hideOut.remove(0);
            this.hideOut.add(toHide);
        }
    }

    public T takeFromHideout() {
        if (!hideOut.isEmpty()) {
            T o = hideOut.get(0);
            hideOut.remove(0);
            return o;
        }
        return null;
    }
    
    public boolean isInHideout(){
        if (this.hideOut.size() == 1){
            return true;
        }
        return false;
    }
}
