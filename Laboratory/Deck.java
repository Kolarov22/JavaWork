import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Deck{
    ArrayList<PlayingCard> myDeck = new ArrayList<>();

    public void addCard(PlayingCard c){
        myDeck.add(c);
    }

    public PlayingCard remove(PlayingCard c) {
        PlayingCard temp = null;
        for (PlayingCard i : myDeck) {
            if (i.getRank() == c.getRank() && i.getSuit() == c.getSuit()) {
                temp = c;
                myDeck.remove(i);
                return temp;
            }
        }
            return temp;
    }

    public void shuffle(){
        Collections.shuffle(myDeck);
    }

    public void sort(){
        Collections.sort(myDeck,
                new Comparator<PlayingCard>() {
                    public int compare(PlayingCard c1, PlayingCard c2) {
                        return c1.getRank().compareTo(c2.getRank());
                    }
                });


        Collections.sort(myDeck,
                new Comparator<PlayingCard>() {
                    public int compare(PlayingCard c1, PlayingCard c2) {
                        return c1.getSuit().compareTo(c2.getSuit());
                    }
                });
    }

}
