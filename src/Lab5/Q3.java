package Lab5;

import java.util.Random;

public class Q3 {
  public static void main(String args[]) {

    Random cardGenerator = new Random();

    Card card = new Card (cardGenerator.nextInt(13), cardGenerator.nextInt(4));
    System.out.println(card.toString());

    System.out.println("Changing the suit to something else...");
    card.setSuit(cardGenerator.nextInt(4));
    System.out.println(card.toString());

    System.out.println("Yeah, the value too...");
    card.setValue(cardGenerator.nextInt(13));
    System.out.println(card.toString());
  }
}
