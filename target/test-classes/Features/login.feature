Feature: To check the login page of ASl airlines by invalid username and password

  Background: 
    Given user should be in ASl login page

  Scenario Outline: To validate invalid username and password
    When user enter the invalid "<username>" and "<password>"
    And user click the login button
    Then user will navigate to the invalid credential page

    Examples: 
      | username             | password   |
      | Selenium@gmail.com   | selenium   |
      | Java@gmail.com       | java       |
      | Greenstech@gmail.com | greenstech |

  @sanity
  Scenario: user fill the all required deatails and moving into next page
    When user click the departure and arrival airport date and passenger deatils
    And user click the search button
    Then user will navigate the flight details page
