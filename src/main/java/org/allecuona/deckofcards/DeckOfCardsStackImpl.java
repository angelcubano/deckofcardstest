package org.allecuona.deckofcards;

import java.util.*;

/**
 * Deque implementation of the <tt>DeckOfCards</tt> interface. Implements
 * all optional DeckOfCards operations. In addition to implementing the <tt>DeckOfCards</tt> interface,
 * this class provides methods to initialice the deck that is used internally.
 *
 * Created by angel on 01/03/16.
 */
public class DeckOfCardsStackImpl implements DeckOfCards {

    /**
     * Deque that represent a deck of cards.
     */
    private Deque<AbstractCard> cards;

    /**
     * Constructs of deck of card.
     */
    public DeckOfCardsStackImpl() {
        cards = new ArrayDeque<AbstractCard>();
        this.initDeckOfCard();
    }

    /**
     * Private function for init deck of cards
     */
    private void initDeckOfCard(){
        for (Suits suit : Suits.values()) {
            for (Ranks rank : Ranks.values()) {
                AbstractCard cardAux = new SimpleCard(suit,rank);
                cards.push(cardAux);
            }
        }
    }

    /**
     * Shuffle the cards in the deck with the remaining cards.
     *
     */
    public void shuffle() {

        List<AbstractCard> listAux = new LinkedList<AbstractCard>();

        while(!cards.isEmpty())
            listAux.add(cards.pop());

        Collections.shuffle(listAux);
        for (AbstractCard card:listAux) {
            cards.push(card);
        }
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
            return cards.pop();
    }

    /**
     * Return the last card of the deck.
     *
     * @return the last card of the deck.
     */
    public Card getLastCard() {
        return cards.removeLast();
    }

    /**
     * Remove all element of the current deck and create a new deck.
     *
     */
    public void resetDeck() {
        while(!cards.isEmpty()){
            cards.pop();
        }
        this.initDeckOfCard();
    }

    public Deque<AbstractCard> getCards() {
        return cards;
    }

    public void setCards(Deque<AbstractCard> cards) {
        this.cards = cards;
    }
}
