import java.util.Random;

public class GamblingSimulation {

	static final int bet = 1;
	static int gamblerTotalStake = 100;
	static final int won = 1;

	public static void main(String[] args) {
		bet();
	}

	public static void bet() {
		
		int stake = gamblerTotalStake / 2;
		int lostStake = gamblerTotalStake - stake;
		int wonStake = gamblerTotalStake + stake;
		
		while ((gamblerTotalStake < wonStake && gamblerTotalStake > lostStake) || gamblerTotalStake == 1) {
			int toss = new Random().nextInt(2);
			
			if (toss == won) {
				gamblerTotalStake += 1;
			} else {
				gamblerTotalStake -= 1;
			}
		}
	}
}
