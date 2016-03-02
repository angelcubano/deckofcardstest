package org.allecuona.deckofcards;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by angel on 02/03/16.
 */
public class DeckOfCardsStackImplTest {

    private DeckOfCardsStackImpl deck;

    private List<AbstractCard> getListByDeque(Deque<AbstractCard> deque){
        List<AbstractCard> listResult = new ArrayList<AbstractCard>();
        while (!deque.isEmpty())
            listResult.add(deque.pop());
        for (AbstractCard card: listResult) {
            deque.push(card);
        }
        return listResult;
    }

    @Test
    public void testShuffle() throws Exception {
        deck = new DeckOfCardsStackImpl();
        List<AbstractCard> originalList = new ArrayList<AbstractCard>();
        List<AbstractCard> originalListAux = getListByDeque(deck.getCards());
        for (AbstractCard card:originalListAux) {
            originalList.add(card);
        }
        deck.shuffle();
        List<AbstractCard> listAfterShuffle = getListByDeque(deck.getCards());
        int size = listAfterShuffle.size();
        int equalValues = 0;
        for (int i = 0; i < size; i++) {
            if(originalList.get(i).equals(listAfterShuffle.get(i)))
                equalValues++;
        }
        assertNotEquals(equalValues,size);
    }

    @Test
    public void testGetTotalCards() throws Exception {
        deck = new DeckOfCardsStackImpl();
        assertEquals(deck.getTotalCards(),52);
        deck.getFirstCard();
        assertEquals(deck.getTotalCards(),51);
    }

    @Test
    public void testHasCard() throws Exception {
        deck = new DeckOfCardsStackImpl();
        assertTrue(deck.hasCard());
        for (int i = 0; i < 52; i++) {
            deck.getFirstCard();
        }
        assertTrue(!deck.hasCard());
    }

    @Test
    public void testGetFirstCard() throws Exception {
        deck = new DeckOfCardsStackImpl();
        SimpleCard simpleCard = new SimpleCard(Suits.SPADES,Ranks.KING);
        assertEquals(simpleCard,deck.getFirstCard());
    }

    @Test
    public void testGetLastCard() throws Exception {
        deck = new DeckOfCardsStackImpl();
        SimpleCard simpleCard = new SimpleCard(Suits.HEARTS,Ranks.ACE);
        assertNotEquals(simpleCard,deck.getFirstCard());
        assertEquals(simpleCard,deck.getLastCard());
    }

    @Test
    public void testResetDeck() throws Exception {
        deck = new DeckOfCardsStackImpl();
        assertEquals(deck.getCards().size(),52);
        for (int i = 0; i < 10; i++) {
            deck.getFirstCard();
        }
        assertEquals(deck.getCards().size(),42);
        deck.resetDeck();
        assertEquals(deck.getCards().size(),52);
    }
}