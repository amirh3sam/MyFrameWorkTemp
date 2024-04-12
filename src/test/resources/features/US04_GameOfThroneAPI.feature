Feature: retrieved all the character of GOT
@api_1
  Scenario: return and validate all the character


    Given API send a request to this "https://thronesapi.com/api/v2/Characters" end point
    When API send a request we except status code 200
    And  Retrived all the data from path id = 1


