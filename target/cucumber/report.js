$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/TechFiosLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios Login Functionality validation",
  "description": "",
  "id": "techfios-login-functionality-validation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4346659500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should be able to login with valid credentials",
  "description": "",
  "id": "techfios-login-functionality-validation;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on bank \u0026 Cash",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on New Account",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on accounts page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters account title as \" Viju Shah  \"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters description as \"saving \"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters initial balance as \" $ 500.00  \"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters account Number as \"23459876\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters contact Person as  \"Benjamin\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters Phone as \"987-876-1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User enters internet Banking URL as \"study123@gmail.com \"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User clicks on Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User should be able to create account successfuly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 5570913500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_username_as(String)"
});
formatter.result({
  "duration": 3296727400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 25
    }
  ],
  "location": "LoginStepDefination.user_enters_password_as(String)"
});
formatter.result({
  "duration": 3138362500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 6030235900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 19345800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_bank_Cash()"
});
formatter.result({
  "duration": 3154951700,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "saving ",
      "offset": 28
    }
  ],
  "location": "LoginStepDefination.user_enters_description_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": " $ 500.00  ",
      "offset": 32
    }
  ],
  "location": "LoginStepDefination.user_enters_initialBalance_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "23459876",
      "offset": 31
    }
  ],
  "location": "LoginStepDefination.user_enters_accountNumber_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Benjamin",
      "offset": 32
    }
  ],
  "location": "LoginStepDefination.user_enters_contactPerson_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "987-876-1234",
      "offset": 22
    }
  ],
  "location": "LoginStepDefination.user_enters_Phone_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "study123@gmail.com ",
      "offset": 37
    }
  ],
  "location": "LoginStepDefination.user_enters_internetBankingURL_in_accounts_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});