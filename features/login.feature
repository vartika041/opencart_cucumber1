Feature: login

  #Scenario: successful login
    #Given user is on site
    #When user enter username & password as "vartika@gmail.com" & "vartika123"
    #Then user landed on site*/

  Scenario Outline: register
    Given user is on register page
    When user enter details as "<username>" & "<password>"
    Then user verifies details

    Examples: 
      | username | password   |
      | vartika  | vartika123 |
