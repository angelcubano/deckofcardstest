package org.allecuona.deckofcards;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList implementation of the <tt>DeckOfCards</tt> interface. Implements
 * all optional DeckOfCards operations. In addition to implementing the <tt>DeckOfCards</tt> interface,
 * this class provides methods to initialice the deck that is used internally and a method for get a card
 * in specified position of deck.
 *
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsListImpl implements DeckOfCards {

    /**
     * LinkedList that represent a deck of cards.
     */
    private List<AbstractCard> cards;

    /**
     * Constructs of deck of card.
     */
    public DeckOfCardsListImpl() {
        cards = new LinkedList<AbstractCard>();
        this.initDeckOfCard();
    }

    /**
     * Private function for init deck of cards
     */
    private void initDeckOfCard(){
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                AbstractCard cardAux = new SimpleCard(suit,rank);
                cards.add(cardAux);
            }
        }
    }

    /**
     * Shuffle the cards in the deck with the remaining cards.
     *
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Return a number of card in the current deck.
     *
     * @return a number of card in the current deck.
     */
    public int getTotalCards() {
        return cards.size();
    }

    /**
     * Return if exist card in the deck.
     *
     * @return <tt>true</tt> if exist card in the deck.
     */
    public boolean hasCard() {
        return !cards.isEmpty();
    }

    /**
     * Return the card that is on top of the deck.
     *
     * @return the card that is on top of the deck.
     *
     */
    public Card getFirstCard() {
        return cards.remove(0);
    }

    /**
     * Return the last card of the deck.
     *
     * @return the last card of the deck.
     */
    public Card getLastCard() {
        return cards.remove(cards.size() - 1);
    }

    /**
     * Remove all element of the current deck and create a new deck.
     *
     */
    public void resetDeck() {
        while (!cards.isEmpty())
            cards.remove(0);
        this.initDeckOfCard();
    }

    /**
     * Returns the card at the specified position in the deck.
     *
     *@return the card at the specified position in the deck.
     */
    public Card getCard(int position) {
        return cards.remove(position);
    }

    public List<AbstractCard> getCards() {
        return cards;
    }

    public void setCards(List<AbstractCard> cards) {
        this.cards = cards;
    }
}
