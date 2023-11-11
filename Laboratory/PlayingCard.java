public class PlayingCard {
    enum Rank {
        ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

        private int value;

        private Rank (int value)
        {
        this.value = value;
        }
    }

    

    enum Suit{
        CLUBS, DIAMONDS, SPADES, HEARTS
    }

    private Rank rank;
    private  Suit suit;

    public PlayingCard(Suit s, Rank r){
        this.suit = s;
        this.rank = r;
    }

    public Rank getRank(){
        return rank;
    }

    public Suit getSuit(){
        return suit;
    }

    

    public String toString(){
        String o="Current card is " + this.getRank() + " " + this.getSuit();
        
        return o;
    }
}

