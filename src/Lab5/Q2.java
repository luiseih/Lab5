package Lab5;

public class Q2 {

  public static void main(String args[]) {
    int tails4 = 0;
    int tails5 = 0;
    int count = 1024;
    Coin coins[] = new Coin[5];

    for (int i = 0; i < coins.length; i++) {
      Coin coin = new Coin();
      coins[i] = coin;
    }

    while (count > 0) {
      int tailsCount = 0;
      for (int i = 0; i < coins.length; i++) {
        coins[i].flipCoin();
        if (coins[i].getState().equals("Tails")) {
          tailsCount++;
        }
      }

      if (tailsCount == 4) {
        tails4++;
      } else if (tailsCount == 5) {
        tails5++;
      }

      count--;
    }

    System.out.println("Tails 4: " + tails4);
    System.out.println("Tails 5: " + tails5);
  }
}
