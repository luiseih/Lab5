package Lab5;

class Card {

  private int value, suit;
  private final String values[] = {
      "Ace", "2", "3", "4", "5", "6",
      "7", "8", "9","10", "Jack", "Queen", "King"};
  private final String suites[] = {"Clubs", "Diamonds", "Hearts", "Spades"};

  Card(int value, int suit) {
    this.value = value;
    this.suit = suit;
  }

  boolean setValue(int newValue) {
    this.value = newValue;
    return true;
  }

  boolean setSuit(int newSuit) {
    this.suit = newSuit;
    return true;
  }

  private String getValue() {
    return values[value];
  }

  private String getSuit() {
    return suites[suit];
  }

  public String toString() {
    return getValue() + " of " + getSuit();
  }
}
