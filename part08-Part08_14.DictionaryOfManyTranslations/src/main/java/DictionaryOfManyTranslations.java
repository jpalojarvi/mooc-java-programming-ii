
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
//        if (!this.dictionary.containsKey(word)){
//            ArrayList<String> translations = new ArrayList<>();
//            translations.add(translation);
//            dictionary.put(word, translations);
//        } 
        this.dictionary.putIfAbsent(word, new ArrayList<>());

//    ArrayList<String> translations = this.dictionary.get(word);
//    translations.add(translation);
        this.dictionary.get(word).add(translation);

    }

    public void remove(String word) {
        if (this.dictionary.containsKey(word)) {
            dictionary.remove(word);
        }
    }

    public ArrayList<String> translate(String word) {
//        if (dictionary.get(word) != null){
//        return dictionary.get(word);
//        }
//        return new ArrayList<>();
//    }
        return dictionary.getOrDefault(word, new ArrayList<>());
    }
}
