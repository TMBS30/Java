import java.util.Scanner;
public class ValidadorCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cpf;
        String cpfSemDigito;
        int numeroD;
        int numeroDMult = 0;
        int numeroV;
        int numeroVMult = 0;
        int dv1;
        int dv2;
        int calculoDV1;
        int calculoDV2;
        String digitosVerificadores;

        // CONSISTE CPF COM 11 DIGITOS *******************************************
        do {
            System.out.printf("Informe seu CPF: ");
            cpf = scanner.nextLine();
            if (cpf.length() != 11) {
                System.out.printf("CPF inválido, tente novamente!\n");
            }
        } while (cpf.length() != 11);

        // CPF SEM DV ***********************************************************
        cpfSemDigito = cpf.substring(0, 9);

        // DIGITOS VERIFICADORES ************************************************
        digitosVerificadores = cpf.substring(9);

        // DV EM NUMEROS
        dv1 = Character.getNumericValue(digitosVerificadores.charAt(0));
        dv2 = Character.getNumericValue(digitosVerificadores.charAt(1));

        // CALCULO DO DV1 ********************************************************
        numeroDMult = 0;
        for (int i = 0; i < 9; i++) {
            numeroD = Character.getNumericValue(cpf.charAt(i));
            numeroDMult += (numeroD * (10 - i));
        }

        calculoDV1 = 11 - (numeroDMult % 11);
        if (calculoDV1 >= 10) {
            calculoDV1 = 0;
        }

        // CALCULO DO DV2 *********************************************************
        numeroVMult = 0;
        for (int i = 0; i < 9; i++) {
            numeroV = Character.getNumericValue(cpf.charAt(i));
            numeroVMult += (numeroV * (11 - i));
        }
        numeroVMult += (calculoDV1 * 2);

        calculoDV2 = 11 - (numeroVMult % 11);
        if (calculoDV2 >= 10) {
            calculoDV2 = 0;
        }

        if (calculoDV1 != dv1) {
            System.out.println("O CPF " + cpf + " não é válido!");
        } else if (calculoDV2 != dv2) {
            System.out.println("O CPF " + cpf + " não é válido!");
        } else {
            System.out.println("O CPF " + cpf + " é válido!");
        }

        System.out.println("CPF + DV: " + cpfSemDigito + "-" + calculoDV1 + calculoDV2);
    }
}
