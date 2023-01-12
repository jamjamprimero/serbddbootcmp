Feature: Wikipedia - Log in
  

  Scenario: Successfully land to Log in page
    Given Browser "<browser>" and website "<website>" is open
    When User select log in button
    Then User successfully land to log in page


    Examples: 
      | browser  | website                                   |
      | chrome   | https://en.wikipedia.org/wiki/Main_Page   |
