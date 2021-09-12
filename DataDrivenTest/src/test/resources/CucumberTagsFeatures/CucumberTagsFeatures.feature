#@Sanity
Feature: Test orange hrm
@Smoke
Scenario: Verify username feild
Given user need to be on hrm login page
When user enter username
Then check username present in the feild or not
And close browser

@Functional
Scenario: Verify password feild
Given user need to be on hrm login page
When user enter username
And user enter password
Then check password present in the feild or not
And close browser