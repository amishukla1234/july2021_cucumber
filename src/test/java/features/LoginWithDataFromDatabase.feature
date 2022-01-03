Feature:  login to Techfios with database

Scenario: user should be able to login with valid credentials
    Given User is on the Techfios login page 
    When User enters username from techfios database   
    When User enters password  from techfios database
    And  user clicks on signin button 
    Then User should land on dashboard page   
