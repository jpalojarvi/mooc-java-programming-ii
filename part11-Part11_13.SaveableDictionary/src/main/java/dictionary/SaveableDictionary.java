package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> dictionary = new HashMap<>();
    private String filename;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) throws Exception {
        this.filename = file;
    }

    public boolean load() {
        try {
            // FileWriter fileWriter = new FileWriter(this.filename);
            Scanner fileReader = new Scanner(Paths.get(filename));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
                this.dictionary.putIfAbsent(parts[1], parts[0]);
            }

        } catch (Exception e) {
            return false;
        }
        return true;
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
