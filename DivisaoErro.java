import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;

public class DivisaoErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numerador = 0;
        float denominador = 0;
        float resultado = 0;
        String mensagem = null;

            try {
                System.out.print("Entre com numerador: ");
                numerador = scanner.nextFloat();
                System.out.print("Entre com denominador: ");
                denominador = scanner.nextFloat();
                resultado = numerador / denominador;
                System.out.println("O resultado da divisão é: " + resultado);
            }
            catch (InputMismatchException e) {
                System.out.println("Erro! Entrada inválida. Por favor, insira números válidos.");
            }
            catch (ArithmeticException e) {
                System.out.println("Erro! Divisão por zero não é permitida.");
            }


        try {
            resultado = numerador / denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro! Divisão por zero não é permitida.");
        }
    }
}