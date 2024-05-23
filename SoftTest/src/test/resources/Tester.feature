
@Feature1
Feature: To validate the login functionality of facebook application

Background:
Given To launch the chrome browser and maximize window
@Smoke
Scenario:To validate the login with valid username and invalid password
When To launch the Url of facebook application
And To pass valid username in email field
And To pass invalid password in password field
And To click the login button
And To check whether navigate to the homepage or not
Then To Close the browser
@Sanity
Scenario Outline: To validate the positive and negative combination of login functionality
When user has to hit the facebook Url
And User has to pass the data "<emaildatas>"in email field
And User has to pass the data "<passworddatas>"in password field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildatas               |passworddatas|
|seleniuminmakes@gmail.com|hagagh       |
|abc@gmail.com            |kcdhjcjgc    |
|testing@gmailcom         |12345        |
|infra@gmail.com          |Sfnhkyikki   |
|apitesting@gmail.com     |9876755      |
|apitest@gmail.com        |sdjjscgjg    |


