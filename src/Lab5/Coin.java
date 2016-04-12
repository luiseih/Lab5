package Lab5;

import java.util.Random;

class Coin {

  private String state = "Heads";

  Coin() {
  }

  void flipCoin() {
    Random randomFlip = new Random();
    if (randomFlip.nextInt(2) == 0) {
      this.state = "Heads";
    } else {
      this.state = "Tails";
    }
  }

  String getState() {
    return state;
  }
}