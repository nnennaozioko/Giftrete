Feature: Login
  As a user of a Giftrete website
  I will like to login
  So thatI can see my homepage.


  Scenario: Valid Login
     Given I navigate to "https://www.giftrete.com/"
     When I click on sign in
     And I enter my email address "nelytino@yahoo.com"
     And I enter my password "kamsiezeh123"
     And I click on sign in
    Then I signed in