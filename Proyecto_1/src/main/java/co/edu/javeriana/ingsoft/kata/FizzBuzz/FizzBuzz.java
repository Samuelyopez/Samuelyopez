package co.edu.javeriana.ingsoft.kata.FizzBuzz;

public class FizzBuzz {

    public String calculate(int number) {
        // Validación de rango 1 a 100
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("El número debe estar entre 1 y 100");
        }

        // Lógica FizzBuzz
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}