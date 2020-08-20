package automation;

public class Master {

	public static void main(String[] args) {
		Check mas = new Check();
		
		mas.sample();
		String[] StrArrarrval = mas.strArrvalues;
		for(String ele :StrArrarrval) {
			System.out.println("values of Array" +ele);
		}
		for(int i=0;i<StrArrarrval.length;i++) {
			System.out.println("Vaues in for loop" + StrArrarrval[i]);
		}
	}

}
