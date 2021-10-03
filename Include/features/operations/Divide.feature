Feature: Devide

  Scenario Outline: Devide by zero
    Given The Calculator page is loaded successfully
    When I devide <firstOperand> by <secondOperand>
    Then I get the result <result>

    Examples: 
      | firstOperand  | secondOperand | result |
      | 27            | 20            | 1.35   |
      | 785           | 25            | 31.4   |