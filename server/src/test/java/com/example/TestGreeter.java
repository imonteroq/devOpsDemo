package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

/**
 * Set of Tests for Greeter class
 */
public class TestGreeter {

  private Greeter greeter;

  /**
   * Test START-UP
   */
  @Before
  public void setup() {
    greeter = new Greeter();
  }

  /**
   *
   */
  @Test
  public void greet_() {
    String someone = "Ignacio";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
