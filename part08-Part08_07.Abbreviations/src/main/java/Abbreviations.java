
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations(){
    }
//    public Abbreviations(String abbreviation, String unAbbreviatiated) {
//        
//    }
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String part) {
        if (this.abbreviations.containsKey(part)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return abbreviations.get(abbreviation);
        }
        return null;
    }
}
