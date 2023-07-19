package pom;

import java.io.IOException;

public class validLoginTestCase extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
	    bt.setUp();
		
		Flib flib = new Flib();
		
		//to call the webElements of login page create the object of login page class
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethod(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		//use HomePage elements create object of home page POM
		HomePage hp = new HomePage(driver);
		hp.clickOnlogOutLink();  
	}

}
