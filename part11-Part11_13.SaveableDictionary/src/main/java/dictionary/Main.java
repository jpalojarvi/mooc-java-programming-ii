package dictionary;

public class Main {

    public static void main(String[] args) throws Exception {
        // You can test your dictionary here
//        SaveableDictionary dictionary = new SaveableDictionary();
//        dictionary.add("apina", "monkey");
//        dictionary.add("banaani", "banana");
//        dictionary.add("ohjelmointi", "programming");
//        dictionary.delete("apina");
//        dictionary.delete("banana");
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("monkey"));
//        System.out.println(dictionary.translate("banana"));
//        System.out.println(dictionary.translate("banaani"));
//        System.out.println(dictionary.translate("ohjelmointi"));

//        SaveableDictionary dictionary = new SaveableDictionary("word.txt");
//        boolean wasSuccessful = dictionary.load();
//
//        if (wasSuccessful) {
//            System.out.println("Successfully loaded the dictionary from file");
//        }
//
//        System.out.println(dictionary.translate("apina"));
//        System.out.println(dictionary.translate("ohjelmointi"));
//        System.out.println(dictionary.translate("alla oleva"));
//        SaveableDictionary s = new SaveableDictionary();
//        s.add("apina", "monkey");
//        s.add("tietokone", "computer");
//        System.out.println(s.translate("monkey"));
//// expected:<apina> but was:<null>

//FAIL: dictionary.SaveableDictionaryTest changesToTheExistingFileGetSaved
//When the file's word-5476.txt contents are:
//apina:monkey
//alla oleva:below
//olut:beer

//Saved with the code
SaveableDictionary s = new SaveableDictionary("word-5476.txt");
s.load();
s.delete("below");
s.add("tietokone", "computer");
s.save();
//the following was saved to a file
//--
//alla oleva:below
//tietokone:computer
//apina:monkey
//olut:beer
//--
//the amount of lines was incorrect expected:<3> but was:<4>
    }
}
