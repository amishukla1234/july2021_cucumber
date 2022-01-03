package pages;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardBankCashPage extends TestBase {

	 WebDriver driver;
	 
	 public DashboardBankCashPage(WebDriver driver) {
		  this.driver = driver;
		
	
	 }
	 
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	 WebElement Bank_And_Cash;
	 @FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	 WebElement New_Account;
	
	 public void clickBankAndCash() {
		 Bank_And_Cash.click();
	 }
	 
	 public void clickNew_Account() {
		 New_Account.click();
	 }
	 public String getPageTitle2() {
		  return driver.getTitle();
		 }
	
	 Random rndm = new Random();
		int rndnmbr= rndm.nextInt(999);
		
		
	 @FindBy(how = How.XPATH, using = "//*[@id=\'account\']")
	 WebElement AccountTitle;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'description\']")
	 WebElement Description;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'balance\']")
	 WebElement InitialBalance;
	 @FindBy(how = How.XPATH, using = "//input[@id=\'account_number\']")
	 WebElement AccountNumber;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'contact_persont\']")
	 WebElement ContactPerson;
	 @FindBy(how = How.XPATH, using = "//input[@id=\'contact_phone\']")
	 WebElement Phone;
	 @FindBy(how = How.XPATH, using = "//*[@id=\'ib_url\']")
	 WebElement InternetBankingURL;
	 @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	 WebElement SubmitButton;

	 
	 
	 

	 public void enterAccountTitle(String accountTitle) {
		 AccountTitle.sendKeys(accountTitle);
		 }
	 public void enterDescription(String description) {
		 Description.sendKeys(description);
		 }
	 public void enterInitialBalance(String balance) {
		 InitialBalance.sendKeys(balance);
		 }
	 public void enterAccountNumber(String accountNumber) {
		 AccountNumber.sendKeys(accountNumber);
		 }
	 public void enterContactPerson(String contactPerson) {
		 ContactPerson.sendKeys(contactPerson);
		 }
	 public void enterPhone(String phone) {
		 Phone.sendKeys(phone);
		 }
	 public void enterInternetBankingURL(String iBankingURL) {
		 InternetBankingURL.sendKeys(iBankingURL);
		 }
	 public void clickSubmitButton() {
		 SubmitButton.click();
		 }
	 
	 
	 

	 
	 
}
