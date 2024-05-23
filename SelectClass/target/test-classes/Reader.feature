Feature: To validate the login functionality of facebook application
Scenario: To validate the login with valid username and invalid password
Given To launch the chrome browser and maximize window
When To launch the Url of facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the homepage or not
Then To Close the browser  

  