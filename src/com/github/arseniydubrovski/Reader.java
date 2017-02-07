package com.github.arseniydubrovski;

import java.util.Scanner;

/**
 * Read  options from standard input.
 * Prints 3 random options.
 */
public class Reader {
  /**
   * Entry point of the program. Reads options from standard input and prints 3 random options.
   *
   * @param args command line params
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] options = input.nextLine().split(" ");
    Selector output = new Selector(options, 3); // TODO: make 3 as constant value
    for (String option : output.select()) {
      System.out.println(option);
    }
  }
}

