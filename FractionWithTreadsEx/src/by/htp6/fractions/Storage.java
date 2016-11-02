package by.htp6.fractions;

public class Storage {
	public static final Storage instance = new Storage();
	
	private Storage(){}
	
	private double x;
	private double sol1;
	private double sol2;
	
	
	public double getX(){
		return x;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getSolution1(){
		return sol1;
	}
	
	public void setSolution1(double sol1){
		this.sol1 = sol1;
	}
	
	public double getSolution2(){
		return sol2;
	}
	
	public void setSolution2(double sol2){
		this.sol2 = sol2;
	}

}
