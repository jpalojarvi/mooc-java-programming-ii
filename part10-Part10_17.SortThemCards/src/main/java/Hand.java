
import java.util.ArrayList;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {

    private ArrayList<Card> hand = new ArrayList<>();

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        hand.sort(comparator);
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue = 0;
        int otherHandValue = 0;
        for (int i = 0; i < this.hand.size(); i++){
            thisHandValue += this.hand.get(i).getValue();
        }
        for (int i = 0; i < o.hand.size(); i++){
            otherHandValue += o.hand.get(i).getValue();
        }
        return thisHandValue - otherHandValue;
    }
}
