Feature: Techfios bank and cash New Account Functionality 

Scenario Outline:  User should be able to login with valid credentials 
	Given User is on the Dashboard page  :  
	When User clicks on "bankCash"      
	When User clicks on "newAccount"   
	And User enters account title as " Viju Shah  " 
	And User enters description as "saving " 
	And User enters initial balance as " $ 500.00  " 
	And User enters account Number as "23459876"
	And User enters contact Person as  "Benjamin"  
	And User enters internet Banking URL as "study123@gmail.com " 
	And User clicks on Submit button 
	Then User should be able to create account successfuly
	
