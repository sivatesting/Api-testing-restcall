Feature: Login into leaftaps application
Background: Login with system admin (positive)
Given Launch the browser
And Load the URL
And Maximize the window
And Set the Implicit wait
Scenario Outline: Create Lead (positive)

#Given Enter the username as <uName> 
#And Enter the Password as <pwd>
#And Click on Login button
And Click on CRM/SFA link
And Click on My Home tab
And Click on Create Lead
And Enter the Company Name as <cName> 
And Enter the First Name as <fName>
And Enter the Last Name as <lName>
When Click on Create Lead button
Then Lead is created 
Examples:
|cName| fName|
|| crmsfa|