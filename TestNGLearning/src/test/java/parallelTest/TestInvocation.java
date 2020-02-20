package parallelTest;

import org.testng.annotations.Test;


/*
 * POM.xml dependencies requires: 
 * -- webdrivermanager v 3.3.0 jar
 * -- selenium-java v 3.141.59 jar
 */

public class TestInvocation extends BaseTest {
	
	//Automation Architect Selenium with 7 Live Project
	@Test(invocationCount=5,threadPoolSize=5)
	public void executeTest() {
		
		driver = getDriver("chrome");
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
