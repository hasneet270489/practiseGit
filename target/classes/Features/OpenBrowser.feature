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
Feature: FLipkart Login
  I want to launch browser and login to flipkart application
    

   @Login
   Scenario: Login to flipkart application
   Given I open Chrome
    And I navigate to url
    And I type username in username_xpath field
    And I type password in password_xpath field
    And I click loginButton_xpath and wait for existingUserText_xpath to be visible
    And I type mobileNumber in mobileNumber_xpath field
    And I press loginButton_xpath
    And I type password in password_xpath field
    When I press continueButton_xpath
    Then login should be success
    
    