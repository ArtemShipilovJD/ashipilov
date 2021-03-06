package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
  }

    public void whenAddOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double expected = 0D;
        assertThat(result, is(expected));
  }

    public void whenAddOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
  }

    public void whenAddOneMultiplyOneThenOne() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double expected = 1D;
        assertThat(result, is(expected));
  }

}