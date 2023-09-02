Feature: add customer of XYZ bank
  Scenario Outline: Add customer of XYZ bank
    Given add customer page
    When Customer input '<FirstName>' and '<LastName>' and '<PostCode>'
    And Click the add customer button
    Then go to the nest page

    Examples:
    |FirstName|LastName|PostCode|
    |afsana   |jahan   |1234    |