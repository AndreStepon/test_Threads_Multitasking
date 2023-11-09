public class Worker extends Thread {
	
	int workerNum;
	int sleepTime;
	
	public Worker(int workerNum, int sleepTime) {
		this.workerNum = workerNum;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("Skaiciuoju " + workerNum + ": " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
	
	
	
	


