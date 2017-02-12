package com.github.arseniydubrovski;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

/**
 * realize  Reverse Polish Notation.
 */
class ReversePolishNotation {

  private static final HashMap<Character, Integer> PRIORITIES = new HashMap<>();
  private static final int LOW_PRIORITY = 1;
  private static final int HIGH_PRIORITY = 2;

  static {
    PRIORITIES.put('+', LOW_PRIORITY);
    PRIORITIES.put('-', LOW_PRIORITY);
    PRIORITIES.put('*', HIGH_PRIORITY);
    PRIORITIES.put('/', HIGH_PRIORITY);
  }

  private char[] inputString;

  /**
   * realize  Reverse Polish Notation.
   *
   * @param inputString string with arithmetic expression.
   */
  public ReversePolishNotation(char[] inputString) {
    this.inputString = inputString;
  }


  /**
   * solve arithmetic expression by Reverse Polish Notation.
   *
   * @return solution of arithmetic expression
   */
  public Integer reversePolishNotation() {
    int currentIndex = 0;
    char input[] = inputString;
    Deque<Integer> stackOfNumbers = new ArrayDeque<>();
    Deque<Character> stackOfOperators = new ArrayDeque<>();
    while (currentIndex < inputString.length) {
      char member = input[currentIndex++];
      if (Character.isDigit(member)) {
        StringBuilder number = new StringBuilder();
        number.append(member);
        while (currentIndex < inputString.length && Character.isDigit(input[currentIndex])) {
          number.append(input[currentIndex++]);
        }

        stackOfNumbers.push(Integer.valueOf(number.toString()));

      } else {
        // assume that char is operator.One of +-\*
        while (!stackOfOperators.isEmpty() && PRIORITIES.get(member) <= PRIORITIES.get(stackOfOperators.peekLast())) {
          Character operator = stackOfOperators.pop();
          Integer secondArgument = stackOfNumbers.pop();
          Integer firstArgument = stackOfNumbers.pop();
          stackOfNumbers.push(applyOperator(operator, firstArgument, secondArgument));
        }
        stackOfOperators.push(member);
      }
    }

    while (!stackOfOperators.isEmpty()) {
      Character operator = stackOfOperators.pop();
      Integer secondArgument = stackOfNumbers.pop();
      Integer firstArgument = stackOfNumbers.pop();
      stackOfNumbers.push(applyOperator(operator, firstArgument, secondArgument));
    }
    return stackOfNumbers.peek();

  }

  /**
   * Apples operator to arguments
   *
   * @param operator  activity between arguments.
   * @param firstArg  first digit onli positive numbers.
   * @param secondArg second digit onli positive numbers.
   * @return result of arithmetic expression.
   */
  private static Integer applyOperator(Character operator, Integer firstArg, Integer secondArg) {
    switch (operator) {
      case '+':
        return firstArg + secondArg;
      case '-':
        return firstArg - secondArg;
      case '*':
        return firstArg * secondArg;
      case '/':
        return firstArg / secondArg;
      default:
        throw new IllegalArgumentException("Illegal operator " + operator);
    }
  }
}

