Feature:  Presentation Manager
  
  The purpose of the feature 
  is to make sure
  that user is able to login with valid user id and password

   Background:
    Given user is on login page
    And user enter username and "heer@heersoftware.com" and password as "123456" and click Login button
    Then home page is displayed
    
 Scenario: Verify that user is able to create new Presentation
   And user click on Presentation Manager
   And click on add a new presentation link
   And user fill out all required details
   And User save presentation      