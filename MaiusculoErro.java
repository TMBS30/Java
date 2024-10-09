import java.util.Scanner;
import java.lang.Throwable;

public class MaiusculoErro {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String texto = null;
        try {
            System.out.println("Entre com texto em maiúsculo:");
            texto = scanner.nextLine();

            if (texto == null || texto.trim().isEmpty()) {
                throw new NullPointerException();
            }

            if (!texto.equals(texto.toUpperCase())) {
                throw new IllegalArgumentException();
            }

            System.out.println("O texto é: " + texto);
        }
        catch (NullPointerException e) {
            System.out.println("Erro! " + e.getMessage() + ". Entre com um texto!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro! " + e.getMessage() + ". Entre apenas com letras em maiúsculo.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}

