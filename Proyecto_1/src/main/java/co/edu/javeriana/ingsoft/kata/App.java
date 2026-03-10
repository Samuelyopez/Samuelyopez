package co.edu.javeriana.ingsoft.kata.FizzBuzz;

public class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println("--- Iniciando FizzBuzz del 1 al 100 ---");

        for (int i = 1; i <= 100; i++) {
            String result = fizzBuzz.calculate(i);
            System.out.println(i + ": " + result);
        }

        System.out.println("--- Fin del programa ---");
    }
}