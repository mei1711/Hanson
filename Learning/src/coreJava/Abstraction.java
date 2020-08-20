package coreJava;

public class Abstraction implements Interfaces {
	
	int intNumber;
	String strName;
	Boolean isClear;
	Float fPercentage;
	Double dDecimal;
	
	public static void main(String[] args) {
		Abstraction objA = new Abstraction();
		
		objA.test();
		

	}

	public void test() {
		System.out.println("Heloo implementing Interfaces");
	}
	public void sample() {
		
	}
	

}
