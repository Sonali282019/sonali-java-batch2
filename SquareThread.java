package daysix.java.threads.com;

class SquareThread extends Thread {
	int number;

	SquareThread(int randomNumbern) {
		number = randomNumbern;
	}

	public void run() {
		System.out.println("square of " + number + " === " + (number * number));
	}
}
