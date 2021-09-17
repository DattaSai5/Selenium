Feature: datatable demo
Scenario: Successful Login with valid entries
Given User is on demowebshoptricentis login page
When user signs in with email and password
|narasimhasai974@gmail.com |Dattasai98@m|
Then user should view logout
