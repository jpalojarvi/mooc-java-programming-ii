
import java.util.ArrayList;


public class Hand {
    private ArrayList<Card> hand = new ArrayList<>();
    
    public void add(Card card){
        this.hand.add(card);
    }
  
    public void print(){
        hand.stream().forEach(card -> System.out.println(card));
    }
}
