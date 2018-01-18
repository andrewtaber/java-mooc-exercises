
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        hand.add(card);
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public void print() {
        for(Card card : hand) {
            System.out.println(card);
        }
    }
    
    public int total() {
        int total = 0;
        for(Card card : hand) {
            total += card.getValue();
        }
        return total;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(hand, new SortAgainstSuitAndValue() );
    }
    
    @Override
    public int compareTo(Hand hand) {
        return this.total() - hand.total();
    }
    
    
}
