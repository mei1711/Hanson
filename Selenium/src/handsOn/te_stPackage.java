package handsOn;

public class te_stPackage {

	@Test	
	public void checkWebDriver() {
		String expected = "Hai";
		String actual = "";
		
		execBrowser();
		
		assert.validate(exopected,actual);
			
	}
}
