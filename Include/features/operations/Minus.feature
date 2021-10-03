Feature: Minus3

  Scenario Outline: Minus
    Given The Calculator page is loaded successfully
    When <firstOperand> minus <secondOperand>
    Then I get the result <result>

    Examples: 
      | firstOperand | secondOperand | result |
      | 10           | 20            | -10    |
      | 123          | 456           | -333   |