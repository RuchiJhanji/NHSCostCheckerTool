package scripts;

import org.testng.TestNG;

public class StartJourneyRunner {
	static TestNG testNg;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {scripts.StartJourney.class});
		testNg.run();
		

	}

}