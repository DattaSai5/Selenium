Feature: Check login with multiple data

Scenario Outline: Successful signin with valid data
Given I am on demowebshop login page
When I login with <email> and <password>
Then I should view the logout link

Examples: 
|email 																		|password|
|dattasai98.m@gmail.com										|Dattasai98@m|
|narasimhasai974@gmail.com								|Dattasai98@m|