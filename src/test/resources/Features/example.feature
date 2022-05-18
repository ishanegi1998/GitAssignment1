Feature: User Registration

  Scenario: User Registration with different dataset
    Given user is on registration page
    When user enters following user details
      | isha   | negi    | i@gmail.com | 89898 | Dehradun |
      | asha   | negi    | a@gmail.com | 88888 | Dehradun |
      | shilpa | solanki | s@gmail.com | 87778 | Pune     |
    And click on OK button
    Then registration is successful

  Scenario: User Registration with different dataset using columns
    Given user is on registration page
    When user enters following user details with coilumns
      | firstname | lastname | email       | phone | location |
      | isha      | negi     | i@gmail.com | 89898 | Dehradun |
      | asha      | negi     | a@gmail.com | 88888 | Dehradun |
      | shilpa    | solanki  | s@gmail.com | 87778 | Pune     |
    And click on OK button
    Then registration is successful
