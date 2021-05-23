
import java.util.ArrayList;


public class Pipe <T> {
    ArrayList<T> pipe = new ArrayList<>();

    public Pipe() {
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if (this.pipe.isEmpty()){
            return null;
        }
        T object = this.pipe.get(0);
        this.pipe.remove(0);
        return object;
    }
    
    public boolean isInPipe(){
        if (this.pipe.isEmpty()){
            return false;
        }
        else {
            return true;
        }
    }
}
