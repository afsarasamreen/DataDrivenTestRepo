Feature: Test orangehrm
Scenario: Verify login
Given user need to be on HRM login page
When user enters username in textbox
And user enters password
And click on login button
Then veriy title of current page


Scenario: Verify username feild
Given user need to be on HRM login page
When user enters username in textbox
Then veriy text present in username feild
