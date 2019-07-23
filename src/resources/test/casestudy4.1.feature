Feature: Payment   
   Scenario: The one the user moves to cart without adding any item to the cart
   Given Alex have logged in the TestMeApp
   When Alex searches for headphones
   And try to proceed to payment without adding to the cart
   Then TestMeApp doesnot show the cart item