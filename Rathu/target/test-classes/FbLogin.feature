Feature: To validate the login functionality of facebook application  
Scenario:To validate login with valid username and valid password
Given To launch the chrome browser and maximize the window
When To launch the url of facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To check whether navigate to homepage or not
Then close to the browser

Scenario Outline: To validate the positive and negative combination of login functionality
Given User has to launch the browser and maximize the window
When User has to hit the facebook url
And User has to pass the data "<emaildata>"in email field
And User has to pass the data "<passworddatas>"in password field
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas               |passworddatas|
|seleniuminmakes@gmail.com|hagagh       |
|abc@gmail.com            |kcdhjcjgc    |
|testing@gmailcom         |12345        |
|infra@gmail.com          |Sfnhkyikki   |
|apitesting@gmail.com     |9876755      |
|apitest@gmail.com        |sdjjscgjg    |