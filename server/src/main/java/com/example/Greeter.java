package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone is the name of the person I want to greet
   * @return phrase for person being greeted
   */
  public final String greet(final String someone) {
    return String.format("Hi %s!", someone);
  }
}
