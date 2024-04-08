Feature:
  Verify the card details

  Scenario: verify the bank name
    Given I perform the GET Operation for "/post"
    And I perform GET for postnumber 1
    Then I should see the author name as "Riyaz Basha"