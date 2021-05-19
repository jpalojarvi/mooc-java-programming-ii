
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // test your code here

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//
//        Hand hand = new Hand();
//
//        hand.add(new Card(2, Suit.DIAMOND));
//        hand.add(new Card(14, Suit.SPADE));
//        hand.add(new Card(12, Suit.HEART));
//        hand.add(new Card(2, Suit.SPADE));
//
//        hand.print();

//        ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        BySuitInValueOrder sortBySuitSorter = new BySuitInValueOrder();
//        Collections.sort(cards, sortBySuitSorter);
//
//        cards.stream().forEach(c -> System.out.println(c));

//With code
Hand hand = new Hand();
hand.add( new Card(14,Suit.SPADE) ); 
hand.add( new Card(12,Suit.HEART) ); 
hand.add( new Card(14,Suit.DIAMOND) ); 
hand.add( new Card(2,Suit.SPADE) ); 
hand.add( new Card(7,Suit.DIAMOND) ); 
hand.sortBySuit();
hand.print();
//first card should beDIAMOND 7
//output was
//SPADE 2
//DIAMOND 7
//HEART Q
//DIAMOND A
//SPADE A
    }
}
