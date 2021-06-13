

public class Main {

    public static void main(String[] args) {
        // Use this main program for testing your classes!
        Suitcase suitcase = new Suitcase(100);
        Item book = new Item("Book", 5); 
        
        suitcase.addItem(book);
        suitcase.addItem(book);
//        System.out.println(suitcase.totalWeight());
        
        Hold hold = new Hold(10);
        hold.addSuitcase(suitcase);
//        hold.printItems();
        
        System.out.println(suitcase.totalWeight());
        suitcase.printItems();
        
    }

}
