Java Deck of Cards TEST
===============================
This project is a Java Library for Deck of Cards. The goal of the library is provide a the principal funtionalities of deck of cards.
In this project you can see and excecute Test all the functionalities of the library using JUnit.


## Technologies used
* Java
* Maven
* JUnit

## Packages
The library only contain 1 package

## (org.allecuona.deckofcards)
This package contanin all the interface, enum and class of the API

## Examples

### Create a Deck of Card
DeckOfCards deck = new DeckOfCardsStackImpl();

### Shuffle the deck
deck.shuffle();

### Get a card from deck
deck.getFirstCard()

### Test
All the functionalities of the classes DeckOfCardsListImpl and DeckOfCardsStackImpl are tested in the test module using JUnit.
