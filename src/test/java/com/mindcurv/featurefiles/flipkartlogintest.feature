Feature: Flipkart Login Test Feature
  # background is prerequisite
  Background:
    Given User is navigated to flipkart website

  @Smoke
  Scenario: Test1_verifyErrorLabelAfterEnteringWrongMobileNumber
    When User enters wrong mobile number in Mobile number text box
    And User Clicks on Request OTP Button
    Then User should verify Error Label "Please enter valid Email ID/Mobile number"

  @Smoke
  Scenario Outline: Test4_verifyErrorLabelAfterEnteringWrongMobileNumber
    When User enters wrong mobile number <mobileNumber> in Mobile number text box
    And User Clicks on Request OTP Button
    Then User should verify Error Label <errorLabel>
    Examples:
      | mobileNumber |  | errorLabel                                   |
      | 4563456      |  | Please enter valid Email ID or Mobile number |
      | 97683644746  |  |                                              |
      | 9768364456   |  |                                              |
      | 9766         |  |                                              |
