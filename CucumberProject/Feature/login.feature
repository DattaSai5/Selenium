Feature: Verify Login
#@valid
@smoke
Scenario: Successful Login with valid credentials
Given User is on login page
When user enters email and password and click on login button
Then user should see logout link

#@invalid
@regression
Scenario: unsucessful Login
Given user on demowenshop login page
When user enter invalid credentials
Then user should see message "Invalid Credentials"