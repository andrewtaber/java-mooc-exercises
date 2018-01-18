
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andytaber
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{
    public int compare(Card card1, Card card2) {
        int difference = 0;
        difference = card1.getSuit() - card2.getSuit();
        if (difference == 0) {
            difference = card1.getValue() - card2.getValue();
        }
        return difference;
    }
}
