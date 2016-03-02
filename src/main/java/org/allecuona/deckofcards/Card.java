package org.allecuona.deckofcards;

/**
 * Cards.
 *
 * This interface represent a card and provide his principal funtionalities
 *
 * Created by angel on 01/03/16.
 */
public interface Card extends Comparable{

    /**
     * Return the suits of card.
     *
     * @return the suits of card.
     */
    Suits getSuit();

    /**
     * Return the rank of card.
     *
     * @return the rank of card.
     */
    Ranks getRank();

}
