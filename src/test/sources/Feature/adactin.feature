
@tag
Feature: Adactin Functionality
  
@tag1
  Scenario: Adactin login Functionality
    Given User navigate to adactin login page
    When User enter username and password "cn1272000" and "cn@1272000"
    Then User click on login button
    
@tag1
	Scenario Outline: Automate Search Hotel Page
	Given User in search hotel page
	When user fill the details like <"location">, <"hotels"> and<"room type">
	Then User click on Search button
	
	Examples:
	|location|hotels|room type|
	|London|Hotel Sunshine|Standard|

