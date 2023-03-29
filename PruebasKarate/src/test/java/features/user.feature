Feature: Patch usuario en JSONPlaceholder reqres
  Scenario: Patch usuario
    Given   url "https://reqres.in/api/users/" + "2"
    And request   {  "name": "mary",  "job": "developer"  }
    When method patch
    Then status 200


