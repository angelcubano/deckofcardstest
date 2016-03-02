package org.allecuona.deckofcards;

/**
 * Represent an instance of Card. Implemente de compareTo functionalities.
 *
 * Created by angel on 01/03/16.
 */
public class SimpleCard extends AbstractCard {

    /**
     * Constructs of the class.
     */
    public SimpleCard(Suits suits, Ranks ranks) {
        super(suits, ranks);
    }

    /**
     * Compares a Card.
     *
     * Returns a negative integer, zero, or a positive integer as this card is less
     * than, equal to, or greater than the specified card.
     *
     */
    public int compareTo(Object obj) {
        SimpleCard simpleCard = (SimpleCard) obj;

        if(this.getRank().equals(Ranks.ACE))
            this.getRank().setValue(14);
        if(simpleCard.getRank().equals(Ranks.ACE))
            simpleCard.getRank().setValue(14);

        return this.getRank().getValue() - simpleCard.getRank().getValue();
    }

}