Feature: Login into leaftaps application
@Sanity
Scenario Outline: Login with system admin (positive)
Given Launch the browser
And Load the URL
And Maximize the window
And Set the Implicit wait
And Enter the username as <uName>
And Enter the Password as <pwd>
When Click on Login button
Then Login should be succeessful 
Examples:
|uName| pwd|
|DemoSalesManager| crmsfa|