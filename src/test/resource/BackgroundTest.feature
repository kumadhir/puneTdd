Feature: Posting Ride
  In order to allow employee to ride with me
  As a Car Owner
  Want to have feature to post a ride
Background:
    Given employee post all carrect data
  @varite
  Scenario: Valid Post
    When Click on Submit
    Then System display a message "Post is successful"

    @barclays
    Scenario: Invalid Post
    And except email
    When Click on Submit
    Then System display a message "Post is unsuccessful"
    
    @varite
    Scenario: SecondInvalid Post
    And employee enter "Naveen", "naveenhome@gmail.com", "9810547500", "Office", "Viman Nagar", "4:30", "12/12/15"
    When Click on "Submit"
    Then System display a message "Post is successful"
    