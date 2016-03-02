package org.allecuona.deckofcards;


/**
 * Abstract represantation of <tt>Card</tt> that implemented Card interface
 *
 * Created by angel on 01/03/16.
 */
public abstract class AbstractCard implements Card {

    /**
     * Suit of card
     */
    private Suits suit;

    /**
     * Rank of card
     */
    private Ranks rank;

    /**
     * Constructs of the class.
     */
    public AbstractCard(Suits suits, Ranks ranks) {
        this.suit = suits;
        this.rank = ranks;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    public void setRank(Ranks rank) {
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractCard)) return false;

        AbstractCard that = (AbstractCard) o;

        if (getSuit() != that.getSuit()) return false;
        return getRank() == that.getRank();

    }

    @Override
    public int hashCode() {
        int result = getSuit().hashCode();
        result = 31 * result + getRank().hashCode();
        return result;
    }
}
