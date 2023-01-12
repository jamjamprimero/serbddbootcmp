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
@testcases
Feature: Switching languages

  @TC001
  Scenario: Changing page language from Español to English using Wiki Page Information
    Given Wiki page is opened 
    When Page information is clicked
		Then Validate Page content language is "en - English"
		And User navigates back to Main Page
		When "Español" "es" is clicked under Languages section
		Then User is redirected to "https://es.wikipedia.org/wiki/Wikipedia:Portada"
		When Page information is clicked
		Then Validate Page content language is "es - español"
		
##	@TC002
##	Scenario: Changing page language from Español to English html attribute
##    Given Wiki page is opened 
##    Then Validate the page language is set to "en"
##		When "Español" is clicked under Languages section
##		Then User is redirected to "https://es.wikipedia.org/wiki/Wikipedia:Portada"
##		Then Validate the page language is set to "es"