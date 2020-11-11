package test;

class TickTock {
	public void tick() throws InterruptedException {
		synchronized (this) {
			System.out.print("Tick	");
			this.notify();
			//this.wait();
			this.wait(1000);
		}
	}

	public void tock() throws InterruptedException {
		synchronized (this) {
			System.out.println("	Tock");
			this.notify();
			//this.wait();
			this.wait(1000);
		}
	}
}

class CThread implements Runnable {
	private Thread thread;

	public CThread(String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}

	private static TickTock tt = new TickTock();

	@Override
	public void run() throws RuntimeException {
		try {
			if (Thread.currentThread().getName().equals("TickThread")) {
				for (int count = 1; count <= 5; ++count) {
					tt.tick();
					Thread.sleep(250);
				}
			} else {
				for (int count = 1; count <= 5; ++count) {
					tt.tock();
					Thread.sleep(250);
				}
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);
		}
	}
}

public class Program {
	public static void main(String[] args) {
		CThread th2 = new CThread("TockThread");
		CThread th1 = new CThread("TickThread");
	}
}
