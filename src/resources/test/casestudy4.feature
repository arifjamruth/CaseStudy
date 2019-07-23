Feature: Payment   
   Scenario: The one the user moves to cart without adding any item to the cart
   Given Alex has registered to the TestMeApp
   When Alex searches for a particular product like headphones
   And try to proceed to payment with adding to the cart
   Then TestMeApp does show the cart item