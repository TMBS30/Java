import java.util.Scanner;

public class TrataErro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*try {
            System.out.print("Digite um valor inteiro..:");
            int numero1 = s.nextInt();
            System.out.print("Digite um valor inteiro..:");
            int numero2 = s.nextInt();

            System.out.println(numero1+ " + " + numero2 + " = " + (numero1+numero2));
        } catch (Exception ex) {
            System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
        }*/

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
