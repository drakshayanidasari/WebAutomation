Feature: search functionality

  Scenario Outline: i want search the product diffent name in application
    Given goto home page
    When click the search bar
    Then enter "<product name>"

    Examples: 
      | product name   |
      | shoes          |
      | golf clubs     |
      | widges         |
      | ladies glouses |
  