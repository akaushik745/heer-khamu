Feature: Begin Order
  
  The purpose of the feature 
  is to make sure
  that user is able to login with valid user id and password

  Background: 
    Given user is on login page
    And user enter username and "heer@heersoftware.com" and password as "At1234" and click Login button
    Then home page is displayed
    
Scenario: Verify that user is able to pickup order from pickup location    
   And user click on Begin order 
   And user choose order type pickup
   And user select location 
   And Verify that user is able to pickup order from pickup location
   
Scenario: Verify that user is able to choose delivery type and also check user able to continiue to pick time   
   And user click on Begin order 
   And user choose order type Delivery
   And fill out details with all required fields 
   And Verify that user is able to choose delivery type and also check user able to continiue to pick time
      
   
Scenario: Verify that user is able to change location from change location link and check redirect on location page
    And user click on Begin order 
    And user choose order type pickup
    And user select location    
    And Verify that user is able to change location from change location link and check redirect on location page
    
Scenario: Verify that user is able to see Online Menu page 
   And user click on Begin order 
   And user choose order type pickup
   And user select location 
   And Verify that user is able to see menu page    
   
 Scenario: Verify that user is able to choose time and start order and go on order menu page or not
   And user click on Begin order 
   And user choose order type pickup
   And user select location    
   And user select specific time  
   And Verify that user is able to choose time and start order   
   
 Scenario: verify that user is able to add menu item in cart
   And user click on Begin order 
   And user choose order type pickup
   And user select location    
   And user select specific time  
   And Verify that user is able to choose time and start order
   And verify that user is able to add menu item in cart
   
   
   
   
  
   
   
   
   
   
   
   
   
   