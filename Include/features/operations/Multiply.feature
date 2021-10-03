Feature: Multiply

  Scenario Outline: Multiply
    Given The Calculator page is loaded successfully
    When I multiply <firstOperand> by <secondOperand>
    Then I get the result <result>

    Examples: 
      | firstOperand | secondOperand | result |
      | 27           | 20            | 540    |
      | 123          | 456           | 56088  |