package org.allecuona.deckofcards;

/**
 * Deck of cards.
 *
 * This interface represent a deck of card and provide his principal funtionalities
 *
 * Created by angel on 01/03/16.
 */
public interface DeckOfCards {

    /**
     * Shuffle the cards in the deck with the remaining cards.
     *
     */
    void shuffle();

    /**
     * Return a number of card in the current deck.
     *
     * @return a number of card in the current deck.
     */
    int getTotalCards();

    /**
     * Return if exist card in the deck.
     *
     * @return <tt>true</tt> if exist card in the deck.
     */
    boolean hasCard();

    /**
     * Return the card that is on top of the deck.
     *
     * @return the card that is on top of the deck.
     *
     */
    Card getFirstCard();

    /**
     * Return the last card of the deck.
     *
     * @return the last card of the deck.
     */
    Card getLastCard();

    /**
     * Remove all element of the current deck and create a new deck.
     *
     */
    void resetDeck();
}
