package tests.ios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScripts extends IOSBaseTest {


	
	@Test(groups = { "TestGrp", "All_Test" })
	public void AmazonAppSerachScenario() throws Exception {
		try {
			feature.verifySearchBox();
			feature.autoSuggestion("airpods", "Cell Phones & accessories");
			feature.verifySerachResults();
			feature.togglePrimeButton();
			feature.verifyPrimeSearchResults("Prime");
			feature.clickOnAmazonChoice();
			feature.verifyPrice();
			feature.clickOnBuyNow();
			feature.loginAmazonAccount("testaccount@mail.com", "test1234");
			feature.verifyCheckOutPage();


		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
}
