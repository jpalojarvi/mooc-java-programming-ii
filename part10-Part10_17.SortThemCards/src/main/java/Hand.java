
import java.util.ArrayList;
import java.util.Comparator;


public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();
    
    public void add(Card card){
        this.hand.add(card);
    }
  
    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort(){
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);
        
        hand.sort(comparator);
    }
}
