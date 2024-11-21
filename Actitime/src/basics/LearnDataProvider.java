package basics;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {{"admin","manager"},
			{"Dhoni","Gambhir"},{"Darshan","6106"},
			{"Dinga","Dingi"}};
	return data;
	
	}
}
