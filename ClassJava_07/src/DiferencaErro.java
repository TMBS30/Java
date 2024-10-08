import java.util.Scanner;
public class DiferencaErro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero1;
        double numero2;
        double media;
        double diferenca;
        boolean validando = false;
        while (!validando) {
            try {
                System.out.print("Digite um valor: ");
                numero1 = s.nextDouble();
                System.out.print("Digite um valor: ");
                numero2 = s.nextDouble();
                media = (numero1 + numero2) / 2;
                diferenca = ((numero1 - numero2) / media) * 100;

                if (diferenca > 20) {
                    throw new IllegalArgumentException("A diferença entre os valores é superior a 20%.");
                } else if (diferenca < 0) {
                    throw new IllegalArgumentException("A diferença entre os valores é menor que 0%.");
                }
                System.out.print("A diferença entre " + numero1 + " e " + numero2 + " é de: " + diferenca);
                validando = true;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro! " + e.getMessage() /*+ ".A diferença entre os valores é superior a 20%."*/);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }
}
