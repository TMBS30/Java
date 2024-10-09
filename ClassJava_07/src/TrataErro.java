import java.util.Scanner;

public class TrataErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite seu nome..:");
            String nome = scanner.next();
            System.out.print("Digite seu email..:");
            String email = scanner.next();

            System.out.println(nome + " + " + email);
        } catch (Exception e) {
            System.out.println("ERRO - Valor digitado nao e uma string!");
        }
    }
}
