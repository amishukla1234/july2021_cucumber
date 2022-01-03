package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DashboardBankCashPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefination extends TestBase {
       	LoginPage loginPage; 
       DashboardBankCashPage dashboardBankCashPage;
	
       
       @Before
       public void beforeRun() {
    	   initDriver();
    	   loginPage=PageFactory.initElements(driver, LoginPage.class);
    	   dashboardBankCashPage=PageFactory.initElements(driver, DashboardBankCashPage.class);
       }

  // Given   User is on techfios login page  
       @Given("^User is on the Techfios login page$")
       public void user_is_on_the_Techfios_login_page() throws Throwable {
    	   driver.get("https://techfios.com/billing/?ng=admin/");  
    		 Thread.sleep(3000);
       }

  //When User enters username as "demo@techfios.com"
@When(value="^User enters username as \"([^\"]*)\"$")
public void user_enters_username_as(String username) throws Throwable {
	loginPage = PageFactory.initElements(driver, LoginPage.class); 
	 loginPage.enterUserName(username);
	Thread.sleep(3000);
}
// When User enters password "abc123"
@When("^User enters password as \"([^\"]*)\"$")
public void user_enters_password_as(String password) throws Throwable {
	loginPage.enterPassword(password);
	Thread.sleep(3000);
}
// And User click on Signin Button
@And("^user clicks on signin button$")
public void user_clicks_on_signin_button() throws Throwable {
	loginPage.clickSignInButton();
	Thread.sleep(3000);
}
// Then User should land on Dashboard page
@Then("^User should land on dashboard page$")
public void user_should_land_on_dashboard_page()  {
	String actualTitle =loginPage.getPageTitle();
    String expectedTitle = "Dashboard- iBilling";
    
    Assert.assertEquals(expectedTitle, actualTitle);
	
    
}
  //   Then User clicks on bank &Cash 
   @Then("^User clicks on bank & Cash$")
  public void user_clicks_on_bank_Cash() throws Throwable {
	   dashboardBankCashPage.clickBankAndCash();
	   Thread.sleep(3000);
  }
   
 // Then User clicks on new Account 
  @Then("^User clicks on New Account $")
  public void user_clicks_on_new_Account() throws Throwable {
	  dashboardBankCashPage.clickNew_Account();
	  Thread.sleep(3000);
	  }
  
  //Then User should land on accounts page 
  @Then ("^User should land on accounts page $")
  public void user_should_land_on_accounts_page() {
	  String actualTitle =dashboardBankCashPage.getPageTitle2();
	    String expectedTitle = "Accounts- iBilling";
	    
	    Assert.assertEquals(expectedTitle, actualTitle);
  }
  
  //And  User enters account title as " Viju Shah "
     @And ("^And User enters account title as \"([^\"]*)\"$") 
     public void user_enters_account_title_as(String accountTitle) throws Throwable {
    	 dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
    	  dashboardBankCashPage.enterAccountTitle(accountTitle);
    	  Thread.sleep(3000);
    	}
  //   And User enters description as "saving "
    @ And ("^User enters description as \"([^\"]*)\"$") 
    public void user_enters_description_in_accounts_page (String description) {
    	dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
  	  dashboardBankCashPage.enterDescription(description);
  	  }
     
    // And User enters initial balance as " $ 500.00  " 
    @ And ("^User enters initial balance as \"([^\"]*)\"$")
    public void user_enters_initialBalance_in_accounts_page (String balance) {
    	 dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
   	  dashboardBankCashPage.enterInitialBalance(balance);
     }
   
    // And User enters account Number as "23459876"
    @ And ("^User enters account Number as \"([^\"]*)\"$")
   	  public void user_enters_accountNumber_in_accounts_page (String accountNumber ) {
    	dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
      	  dashboardBankCashPage.enterAccountNumber(accountNumber);
        }
   
//	And User enters contact Person as  "Benjamin" 
   @ And ("^User enters contact Person as  \"([^\"]*)\"$") 
   public void  user_enters_contactPerson_in_accounts_page (String contactPerson) {
	   dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
   	  dashboardBankCashPage.enterContactPerson(contactPerson); 
   }
    
//	And User enters "Phone" as "987-876-1234" 
    @ And ("^User enters Phone as \"([^\"]*)\"$" ) 
   public void user_enters_Phone_in_accounts_page (String phone) {
    	 dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
      	  dashboardBankCashPage.enterPhone( phone); 	
    }
//	And User enters internet Banking URL as "study123@gmail.com "  
   @ And ("^User enters internet Banking URL as \"([^\"]*)\"$" ) 
   public void user_enters_internetBankingURL_in_accounts_page (String iBankingURL) {
	   dashboardBankCashPage = PageFactory.initElements(driver, DashboardBankCashPage.class); 
	   	  dashboardBankCashPage.enterInternetBankingURL(iBankingURL);    
   }
        
//	And User clicks on Submit button 
  @ And ("^User clicks on Submit button $")
  public void user_clicks_on_submit  () throws Throwable {
	  dashboardBankCashPage.clickSubmitButton();
		Thread.sleep(3000);
	  
  }  
	//Then User should be able to validate account created successfully
  @Then ("^User should be able to validate account created successfully $")
   public void user_should_be_able_to_validate_account_created_successfully () throws Throwable {
	  
	 
			String actualTitle2 =dashboardBankCashPage.getPageTitle2();
		    String expectedTitle2 = "";
		    
		    Assert.assertEquals(expectedTitle2, actualTitle2);
		
		    Thread.sleep(3000);}
		
	   public void tearDown() {
  driver.close();
  driver.quit();
}

}
