package by.htp6.fractions;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		Storage storage = Storage.instance;
		
		double sol1;
		double x = storage.getX();
		
		sol1 = Math.pow(x, 2) + 2*x + (11*x - 2)/(3*x + 1);
		
		storage.setSolution1(sol1);
		
	}

}
