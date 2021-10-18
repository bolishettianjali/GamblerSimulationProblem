import java.util.Random;

public class GamblingSimulation {

	static final int bet = 1;
	static int gamblerStake = 100;
	static final int won = 1;

	public static void main(String[] args) {
		bet();
	}

	public static void bet() {
		int toss = new Random().nextInt(2);

		if (toss == won) {
			System.out.println("Gambler Won the game");
		} else {
			System.out.println("Gambler Lost the game");
		}
	}
}
