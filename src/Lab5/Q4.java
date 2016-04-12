package Lab5;

public class Q4 {

  public static void main(String [] args) {

    Deck deck = new Deck();

    System.out.println("Creating deck...");

    deck.deckToString();

    System.out.println("Shuffling deck...");

    deck.shuffleDeck();

    deck.deckToString();

    deck.dealDeck();
  }
}
