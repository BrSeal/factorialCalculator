package org.melnikov.core;

import java.math.BigDecimal;

public abstract class Factorial extends Number {

  public abstract BigDecimal bigDecimalValue();

  public static Factorial of(int num) {
    return new IntegerFactorial(num);
  }
}
