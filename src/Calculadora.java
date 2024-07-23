import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        String operacion;

        do {
            System.out.println("\nPor favor, ingresa el primer número:");
            double num1 = sc.nextDouble();

            System.out.println("¿Qué operación deseas realizar? (+, -, *, /):");
            operacion = sc.next();

            System.out.println("Ingresa el segundo número:");
            double num2 = sc.nextDouble();

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Inténtalo de nuevo.");
            }

            System.out.println("Resultado: " + resultado);
            System.out.println("¿Deseas realizar otra operación? (s/n)");
        } while (sc.next().equalsIgnoreCase("s"));

        System.out.println("¡Hasta luego!");
    }
}