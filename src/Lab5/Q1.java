package Lab5;

public class Q1 {

    public static void main(String args[]) {
        int heads = 0;
        int tails = 0;
        int count = 1000;
        Coin coin = new Coin();

        while (count > 0) {
            coin.flipCoin();
            if (coin.getState().equals("Heads")) {
                heads++;
                count--;
            } else {
                tails++;
                count--;
            }
        }

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
