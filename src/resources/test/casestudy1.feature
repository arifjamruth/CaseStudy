Feature: Regiteration for testme app
  Scenario: Regiteration for testme app
  
     Given User should be in registeration page
     When Enter the user details in the registration page username "arifjamru1000" firstname "Arif" lastName "jamru" password 
     And "arif123" confirmPassword "arif123" emailAddress "arif@gmail.com" mobileNumber "9876543211" dob "11/11/1997"
     And  address "Chennai Chennai" answer "blue" 
     Then Registration successful 