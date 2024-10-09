import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Throwable;

public class MediaErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1 = 0;
        float nota2 = 0;
        float resultado = 0;
        String mensagem = null;

        try {
            System.out.print("Entre com a 1° nota : ");
            nota1 = scanner.nextFloat();
            System.out.print("Entre com a 2° nota: ");
            nota2 = scanner.nextFloat();
            resultado = (nota1 + nota2) / 2 ;
            System.out.println("A média é: " + resultado);
        }
        catch (InputMismatchException e) {
            System.out.println("Erro! Entrada inválida. Por favor, insira números válidos.");
        }
        catch (ArithmeticException e) {
            System.out.println("Erro! Divisão por zero não é permitida.");
        }

    }
}
