Feature:  Canvas Board
  
  The purpose of the feature 
  is to make sure
  that user is able to login with valid user id and password

   Background:
    Given user is on login page
    And user enter username and "heer@heersoftware.com" and password as "123456" and click Login button
    Then home page is displayed
    
#Scenario: Verify that user is able to create new board for start from scratch empity Canvas
   #And user go on menu board manager page
   #And user click on Add a new board button
   #And user click on Start from scratch
   #And fill out form with all required fields
   #And user click on Save button
    #
    
 Scenario: Verify That user is able to edit menu board item
   And user go on menu board manager page
   And click on edit icon
   And user click on menu item
   And select menu item description on page
   And user is on customize page and then see user is able to set toolset   
    
 Scenario: Verify that user is able to delete Item,price and description From Customization board
   And user go on menu board manager page
   And click on edit icon
   And user click on menu item
   And select menu item description on page
   And user is on customize page and then see user is able to set toolset   
   And select menu item description on page 
   And Delete menu item from Customization page