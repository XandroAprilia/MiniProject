package qaautomation.october2021.MMTripTest;

import org.testng.annotations.Test;

import october.automation.pages.MMTripBase.HomeMakeMyTrip;
import utils.TestUtility;

public class MMTripTestRun extends MMTripBaseTest {

	HomeMakeMyTrip searchFlight = new HomeMakeMyTrip(driver, explicitWait);

	@Test
	public void test1() {
		String From = "Delhi";
		searchFlight.From(From);
		TestUtility.hardWait(1);
		
		String ToDestination = "Jakarta";
		searchFlight.ToDestination(ToDestination);
		TestUtility.hardWait(1);
			
		String Calen = "Monday Nov 22 2021";
		searchFlight.CalenDepar(Calen);
		TestUtility.hardWait(5);
		
		searchFlight.HargaTermurah();
	}
}
