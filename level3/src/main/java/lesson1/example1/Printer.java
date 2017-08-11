package lesson1.example1;

public class Printer {

	private final Lock lock = new ReentrantLock(false);
	private int completedJobs = 0;
	
	public void print(String message) {
		lock.lock();
		try {
			System.out.println(message + " - Printed " + ++completedJobs + " jobs.");
		} finally {
			lock.unlock();
		}
	}
	
	public int getCompletedJobs() {
		return completedJobs;
	}
}