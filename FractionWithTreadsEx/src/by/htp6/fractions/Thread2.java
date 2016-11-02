package by.htp6.fractions;

public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		Storage storage = Storage.instance;
		
		double sol2;
		
		double x = storage.getX();
		
		sol2 = x + 1 - (Math.pow(x, 2) + x + 2)/(3*x + 1);
		
		storage.setSolution2(sol2);
		
	}

}
