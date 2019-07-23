Feature: Login and Find the headphone

  Scenario Outline: Login
    Given User opens the browser and User enters username and password 
    When User searches headphone in the search box "<name>"
    Then Validating the search result
    
    	Examples:
		|name|
		|head|
		|headphone|
		|earphone|