Feature: Techfios Login Functionality validation

Scenario: user should be able to login with valid credentials
    Given User is on the Techfios login page           
    When User enters username as "demo@techfios.com"         
    When User enters password as "abc123"   
    And  user clicks on signin button  
    Then User should land on dashboard page   
    Then User clicks on bank & Cash     
	And User clicks on New Account
	Then User should land on accounts page  
	And User enters account title as " Viju Shah  " 
	And User enters description as "saving " 
	And User enters initial balance as " $ 500.00  " 
	And User enters account Number as "23459876"
	And User enters contact Person as  "Benjamin" 
	And User enters Phone as "987-876-1234"
	And User enters internet Banking URL as "study123@gmail.com " 
	And User clicks on Submit button 
	Then User should be able to create account successfuly