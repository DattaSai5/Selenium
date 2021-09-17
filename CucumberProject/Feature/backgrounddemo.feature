Feature: Check title

Background: driver installed
Given I am on the home page demowebshop

@smoke
Scenario: Verify title of demowebshop
Then I should see the title contains "shop"

@regression
Scenario: Check the source of demowenshop
Then I should see the source contains "shop"