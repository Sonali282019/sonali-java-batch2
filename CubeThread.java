package daysix.java.threads.com;

class CubeThread extends Thread {
	int number;

	CubeThread(int randomNumber) {
		number = randomNumber;
	}

	public void run() {
		System.out.println("Cube of " + number + " === " + number * number * number);
	}
}