import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.lang.Throwable;

public class Erros {
    public static void main(String args[]) {
        String senhaSecreta = "123456";
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();
            if (!senha.equals(senhaSecreta)){
                throw new Exception("Senha invalida!!!");
            }
            System.out.println("Senha correta!!!\nBem vindo(a)!!!");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}


