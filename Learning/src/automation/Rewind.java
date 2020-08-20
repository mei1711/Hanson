package automation;

public class Rewind {

	public static void main(String[] args) {
		try {
			Validate ObjA = new Validate();
			Test objB = new Test("Mei");
			ObjA.sample();
			
			
		} catch (Exception e) {

		}

	}

}

interface store {
	public void check();

}

class Test implements store {
	private String strname ;
	public Test() {

	}
	public Test(String name) {
	this.strname = name;
	System.out.println(this.strname);
	}

	public void check() {
		Test objC = new Test();
		System.out.println("Providing implementATION TO interface" + this.strname);
		
	}

	public Test(String a, String b) {
		System.out.println("Heloo iam from param Constructor");

	}

	public void print() {
		System.out.println("heloo iam an method");
	}
}

class Validate extends Test {
	public Validate() {
		super("Hi", "Heloo");
	}
    Test Objb = new Test();
	public void sample() {
		System.out.println("Heloo iam from implemented class");
		print();
		Objb.check();
	}
}