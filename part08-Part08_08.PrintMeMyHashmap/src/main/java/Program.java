
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e.", "for example");
        hashmap.put("etc.", "et cetera ~ and so on");
        hashmap.put("i.e.", "id est ~ more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String iteratedKey : hashmap.keySet()) {
            System.out.println(iteratedKey);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String iteratedKey : hashmap.keySet()) {
            if (iteratedKey.contains(text)) {
                System.out.println(iteratedKey);
            }
        }

    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String iteratedKey : hashmap.keySet()) {
            if (iteratedKey.contains(text)) {
                System.out.println(hashmap.get(iteratedKey));
            }
        }
    }
}
