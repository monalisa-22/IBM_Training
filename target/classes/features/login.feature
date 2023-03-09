Feature: Search

@smoke
Scenario: Testing multiple scenario case1
Given Test multiple scenario case1

@smoke
Scenario: Testing multiple scenario case2
Given Test multiple scenario case2

@Regression
Scenario Outline: validate search functionality
Given user is in search page
When user enters "<product>" products
And Click on search button
Then Product "<product>" should be displayed

Examples: 
 | product |
 | iPhone |
 | MacBook Air |
 | MacBook Pro |