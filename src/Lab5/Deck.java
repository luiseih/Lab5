package Lab5;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class Deck {

  ArrayList <Card> cards = new ArrayList <Card>(52);
  Random random = new Random();

  Deck() {
    for (int suit = 0; suit < 4; suit++) {
      for (int value = 0; value < 13; value++) {
        Card card = new Card(value, suit);
        cards.add(card);
      }
    }
  }


  void shuffleDeck() {
    int index;
    Card temp;
    for (int i = cards.size() - 1; i > 0; i--) {
      index = random.nextInt(i + 1);
      temp = cards.get(index);
      cards.set(index, cards.get(i));
      cards.set(i, temp);
    }
  }


  void dealDeck() {
    System.out.println("Press ENTER to deal a card, or type EXIT to quit...");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();

    while (true) {
      if (text.equals("EXIT")) {
        System.out.println("Good bye.");
        break;

      } else if (cards.size() < 1) {
        System.out.println("Out of cards!");
        System.out.println("Do you want a new deck? (Y/N)");
        text = scanner.next();

        if (text.equalsIgnoreCase("y")) {
          Deck deck = new Deck();
          deck.shuffleDeck();
          deck.dealDeck();

        } else {
          System.out.println("Good bye!");
          break;
        }

        break;

      } else {
        int randomCard = random.nextInt(cards.size());
        System.out.println(cards.get(randomCard).toString());
        cards.remove(randomCard);
        text = scanner.nextLine();
      }
    }
  }


  public void deckToString() {
    for(int i = 0; i < 51; i++) {
      System.out.println(cards.get(i).toString());
    }
  }
}
