Feature: Plus

  Scenario Outline: Plus
    Given The Calculator page is loaded successfully
    When <firstOperand> plus <secondOperand>
    Then I get the result <result>

    Examples: 
      | firstOperand | secondOperand | result |
      | 10           | 20            | 30     |
      | 123          | 456           | 579    |