package dictionary;

import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public SaveableDictionary() {
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return this.dictionary.getOrDefault(word, null);
    }

    public void delete(String word) {
        String valueToBeRemoved;
        if (this.dictionary.containsValue(word)) {
            valueToBeRemoved = this.dictionary.get(word);
            this.dictionary.remove(valueToBeRemoved);
        }
        this.dictionary.remove(word);

    }
}
