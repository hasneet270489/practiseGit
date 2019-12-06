#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login to flipkart application
  I want to open browser and login to flipkart application

  
                  
                  
   @MultipleLogins
   Scenario Outline: Multiple Logins
   Given I launch <browsers> and open url
   And I login to application
   |username               |hasneet270489@gmail.com   |
   |password               |Honda@123                 |
   |phoneNumber            |9654806255                |
   Examples:
   |browsers|username               |password |
   |chrome  |hasneet270489@gmail.com|Honda@123|
   
   
    