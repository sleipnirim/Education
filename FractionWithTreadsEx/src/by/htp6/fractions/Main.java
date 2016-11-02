package by.htp6.fractions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Storage storage = Storage.instance;
	
		@SuppressWarnings("resource")
		Scanner conin = new Scanner(System.in);
		System.out.print("Enter x  >");
		storage.setX(conin.nextDouble());
		System.out.println("");
		
		Thread1 sol1= new Thread1();
		Thread2 sol2= new Thread2();
		Thread th1 = new Thread(sol1);
		Thread th2 = new Thread(sol2);
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double result = storage.getSolution1() + storage.getSolution2();
		System.out.println("Solution is - " + result);
		
	}
}
