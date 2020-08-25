Feature: SearchFlights 
#This is how background can be used to eliminate duplicate steps 

Background: 
  User enters search details of Flight and click on submit buttom 

Scenario: Search with Valid input values
Given User is on homepage
When User enters originairport
And User enters destinationairport
And User clicks on sumbit button
Then correct url is displayed



