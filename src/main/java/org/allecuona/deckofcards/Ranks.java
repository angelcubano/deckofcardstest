package org.allecuona.deckofcards;

/**
 * Represent the rank of the card
 *
 * Created by angel on 01/03/16.
 */
public enum Ranks {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private int value;

    Ranks(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }
}
