import java.util.Scanner;

public class NovaSenhaErro {
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
            System.out.println("Altere a senha: ");
            senhaSecreta = scanner.nextLine();
            System.out.printf("Senha altearada com sucesso!");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
