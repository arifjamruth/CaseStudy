Feature: Login and Find the headphone

@login
  Scenario Outline: Login
    Given User opens the browser
    When User enters username "<user>" and password "<password>"
    Then Validates the user credentials
    
    	Examples:
		|user||password|
		|lalitha||password123|
    
@search
	Scenario: Search
		Given User have logged in with the credentials
		When User searches headphone in the search box
		Then Validating the outcome
    

