import java.util.Random;

public class GamblingSimulation {

	static final int bet = 1;
	static int gamblerTotalStake = 100;
	static final int won = 1;
	static int totalDaysWon;
	static int totalDaysLost;
	static int totalAmountWonInMonth;
	static int totalAmountLostInMonth;

	public static void main(String[] args) {
		for (int day = 1; day <= 30; day++) {
			if (gamblerTotalStake <= 0) {
				System.out.println("\nGambler has no amount to Bet, amount: " + gamblerTotalStake);
				break;
			} else {
				System.out.println("\nDay-" + day + " started with amount: " + gamblerTotalStake);
				bet(day);
			}
		}
		System.out.println("\nTotal Days won in a month: " + totalDaysWon + ", By amount: " + totalAmountWonInMonth);
		System.out.println("Total Days lost in a month: " + totalDaysLost + ", By amount: " + totalAmountLostInMonth);
	}

	public static void bet(int day) {

		int stake = gamblerTotalStake / 2;
		int lostStake = gamblerTotalStake - stake;
		int wonStake = gamblerTotalStake + stake;
		int amountBeforeBet = gamblerTotalStake;

		while ((gamblerTotalStake < wonStake && gamblerTotalStake > lostStake) || gamblerTotalStake == 1) {
			int toss = new Random().nextInt(2);

			if (toss == won) {
				gamblerTotalStake += 1;
			} else {
				gamblerTotalStake -= 1;
			}
		}

		int amountWon = gamblerTotalStake - amountBeforeBet;
		int amountLost = amountBeforeBet - gamblerTotalStake;

		if (amountBeforeBet < gamblerTotalStake) {
			System.out.println("On Day-" + day + ", Gambler won total amount: " + amountWon);
			totalDaysWon++;
			totalAmountWonInMonth += amountWon;
		} else if (amountBeforeBet > gamblerTotalStake) {
			System.out.println("On Day-" + day + ", Gambler lost total amount: " + amountLost);
			totalDaysLost++;
			totalAmountLostInMonth += amountLost;
		}

		System.out.println("Gambler remaining amount: " + gamblerTotalStake);
	}
}
