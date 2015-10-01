Feature: Posting Ride
  In order to allow employee to ride with me
  As a Car Owner
  Want to have feature to post a ride

  Scenario Outline: Valid Post
    Given employee post <Name> and <Email> and <Phone>
    When Click on <AButton>
    Then System display a <eMessage>
    
Examples:
|Name|Email|Phone|AButton|eMessage|
|"Naveen"|"naveenhome@gmail.com"|"9810547500"|"Submit"|"Successful"|
|" "|"naveenhome@gmail.com"|"9810547500"|"Submit"|"UnSuccessful"|    
|"Naveen"|"naveenhome@gmail.com"|" "|"Submit"|"UnSuccessful"|    