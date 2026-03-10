package co.edu.javeriana.ingsoft.kata.FizzBuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testMinDomainRange() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int minValue = 0; // Menor que 1
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(minValue));
    }

    @Test
    void testMaxDomainRange() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int maxValue = 101; // Mayor que 100
        //Act & Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.calculate(maxValue));
    }

    @Test
    void testFizz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 3;
        String expected = "Fizz";
        //Act
        String result = fizzBuzz.calculate(value);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 10;
        String expected = "Buzz";
        //Act
        String result = fizzBuzz.calculate(value);
        //Assert
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz() {
        //Arrange
        FizzBuzz fizzBuzz = new FizzBuzz();
        int value = 15;
        String expected = "FizzBuzz";
        //Act
        String result = fizzBuzz.calculate(value);
        //Assert
        assertEquals(expected, result);
    }
}