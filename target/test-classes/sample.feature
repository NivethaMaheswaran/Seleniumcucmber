Feature: To validate the login functionality of Instagram application

Background:
Given To launch the browser and maximize the window

Scenario: To validate login with valid username and invalid password
When To launch the url
And To pass the mailId in username field
And To pass the password in password field
And To Click the login button
And To navigate the home page or not
Then To close the Browser

Scenario Outline: To validate the positive and negative combination of login functionality
When User has to launch the url
And User has to pass the mail id in emaild"<emaildata>" field
And User has to pass the password in password"<passwordata>" field
And User has to click the login button
Then User has to close the browser

Examples:
|emaildata|passwordata|
|nivetha98san@gmail.com|Nivetha|
|nivetha16121432gmail.com|Nivi9u8979|
|shankarjjd@gmail.com|kjerfhi|
|sowmiya@gmail.com|fhudsjf|
|Instanijhvicx@gmail.com|hxdfhjj|
|kuttymaheswaran@gmail.com|hdiushfjkh|
