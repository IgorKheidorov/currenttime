package com.github.arseniydubrovski;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Chooses set numbers of random options.
 */
class Selector {

  private String[] options;
  private int count;

  /**
   * Constructor
   *
   * @param options all available options
   * @param count   numbers of options to select
   */
  public Selector(String[] options, int count) {
    this.options = options;
    this.count = count;
  }

  /**
   * returns set numbers of random options.
   *
   * @return set numbers of random options
   */
  public List<String> select() {
    List<String> result = new ArrayList<>();
    if (options.length < count) {
      System.out.println("less then 3 options");
      return result;
    }
    Set<Integer> chosenIndexes = new HashSet<>();
    while (chosenIndexes.size() < count) {
      Integer index = ThreadLocalRandom.current().nextInt(0, options.length);
      if (!chosenIndexes.contains(index)) {
        result.add(options[index]);
        chosenIndexes.add(index);
      }
    }
    //TODO: read about Stream API
    return result;
  }
}
