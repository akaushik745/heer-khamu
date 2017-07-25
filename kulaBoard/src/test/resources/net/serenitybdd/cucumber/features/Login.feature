Feature:  Login to application
  
  The purpose of the feature 
  is to make sure
  that user is able to login with valid user id and password


Scenario: Verify that user is able to Login 
    Given user is on login page
    And user enter username and "heer@heersoftware.com" and password as "123456" and click Login button
    Then home page is displayed
    
