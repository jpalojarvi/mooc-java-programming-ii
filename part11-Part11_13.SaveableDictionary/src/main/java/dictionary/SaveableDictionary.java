package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
;
import java.util.Scanner;



public class SaveableDictionary {

    private HashMap<String, String> dictionary = new HashMap<>();
    private HashMap<String, String> dictionaryReversed = new HashMap<>();
    private String filename;

    public SaveableDictionary() {
    }

    public SaveableDictionary(String file) throws Exception {
        this.filename = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(filename));

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
                this.dictionaryReversed.putIfAbsent(parts[1], parts[0]);
            }

        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            PrintWriter printWriter = new PrintWriter(this.filename);
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                printWriter.println(entry.getKey() + ":" + entry.getValue());
            }
            printWriter.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
        this.dictionaryReversed.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionaryReversed.containsKey(word)) {
            return this.dictionaryReversed.get(word);
        } else {
            return null;
        }
    }

    public void delete(String word) {

        if (this.dictionary.containsKey(word)) {
            String correspondingValue = dictionary.get(word);
            this.dictionaryReversed.remove(correspondingValue);
            this.dictionary.remove(word);
        } else if (dictionaryReversed.containsKey(word)) {
            String correspondingValue = dictionaryReversed.get(word);
            this.dictionary.remove(correspondingValue);
            this.dictionaryReversed.remove(word);

        }
    }
}
