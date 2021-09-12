Feature: Test Orange HRM
Scenario Outline: Verify Username Feild
Given user need to be on HRM Login Page
When user enters "<username>" username
Then check  username present in feild or not
Examples:
 |username|
 |Admin|
 |Samreen|
