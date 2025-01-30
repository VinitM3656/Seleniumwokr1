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
#<> (placeholder)y b 
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: login

  @tag1
  Scenario: Successful login with valid credentials
    Given User launch chrome Browser
   
    When User opens URL ="https://admin-demo.nopcommerce.com/login"
    And User enters Email as " admin@yourstore.com" and Password as "admin123"
    And Click on login
    Then page title should be "Dashbord / nopCommerce administration"
    When User click on log out link
    Then page Title should be " your store.login"
    And close browser

