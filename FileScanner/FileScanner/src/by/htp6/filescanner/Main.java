package by.htp6.filescanner;

public class Main {

	public static void main(String[] args) {
		FileScanner fileScanner = new FileScanner();
		Thread th = new Thread(fileScanner);
		th.start();
		
		try {
			Thread.sleep(600000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		fileScanner.stop = true;
	}

}
