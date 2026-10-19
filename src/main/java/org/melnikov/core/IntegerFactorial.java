package org.melnikov.core;

import java.math.BigDecimal;

public class IntegerFactorial extends Factorial {

  final int base;

  protected IntegerFactorial(int base){
    this.base = base;
  }

  @Override
  public BigDecimal bigDecimalValue() {
    return calculateBigDecimal();
  }

  @Override
  public int intValue() {
    return (int) calculateLong();
  }

  @Override
  public long longValue() {
    return calculateLong();
  }

  @Override
  public float floatValue() {
    return calculateFloat();
  }

  @Override
  public double doubleValue() {
    return calculateDouble();
  }

  private long calculateLong() {
    long res = 1;
    int current = base;
    while (current > 1) {
      res *= current--;
    }

    return res;
  }

  private  float calculateFloat() {
    float res = 1;
    int current = base;
    while (current > 1) {
      res *= current--;
    }

    return res;
  }

  private double calculateDouble() {
    double res = 1;
    int current = base;
    while (current > 1) {
      res *= current--;
    }

    return res;
  }

  private BigDecimal calculateBigDecimal() {
    BigDecimal res = BigDecimal.ONE;
    int current = base;
    while (current > 1) {
      res = res.multiply(new BigDecimal(current--));
    }

    return res;
  }
}
