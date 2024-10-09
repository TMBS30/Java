import java.util.Scanner;

public class calculaIR {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        calculaIR cIR = new calculaIR();

        String nome = null;
        float salario = 0f;
        String faixaImposto = null;
        float impostoPagar = 0;
        int consulta = 1;
        float faixa2, faixa3, faixa4 = 0;

        faixa2 = (2826.66f - 2259.00f) * 0.075f;
        faixa3 = (3751.06f - 2826.67f) * 0.15f;
        faixa4 = (4664.68f - 3751.07f) * 0.225f;

        System.out.println("Calculo do IR\n");

        do{
            System.out.println("Informe seu nome: ");
            nome = scanner.nextLine();
            System.out.println("Informe seu salario: ");
            salario = scanner.nextFloat();


            //faixa 1
            if(salario <= 2259){
                faixaImposto = "Faixa 1";
                impostoPagar = 0.00f;
            }

            //faixa 2
            else if(salario >= 2259.01f && salario <= 2826.66f){
                faixaImposto = "Faixa 2";
                impostoPagar = (salario - 2259.01f) * 0.075f;
            }

            //faixa 3
            else if(salario >= 2826.67f && salario <= 3751.06f){
                faixaImposto = "Faixa 3";
                impostoPagar = ((salario - 2826.67f) * 0.15f) + faixa2;
            }

            //faixa 4
            else if(salario >= 3751.07f && salario <= 4664.68f){
                faixaImposto = "Faixa 4";
                impostoPagar = ((salario - 3751.07f) * 0.225f) + faixa2 + faixa3;
            }

            //faixa 5
            else if(salario >= 4664.68f){
                faixaImposto = "Faixa 5";
                impostoPagar = ((salario - 4664.68f) * 0.275f) + faixa2 + faixa3 + faixa4;
            }
            String salarioDecimal = String.format("%.2f", salario);
            String impostoPagarDecimal = String.format("%.2f", impostoPagar);

            System.out.println("Nome: " + nome);
            System.out.println("Salario: R$" + salarioDecimal);
            System.out.println("Faixa de Imposto: " + faixaImposto);
            System.out.println("Imposto a pagar: R$" + impostoPagarDecimal);
            cIR.exibeTabelaAliquotas();

            do{
                System.out.println("\nRealizar nova consulta? \nSIM[1]\nNÃO[0]");
                consulta = scanner.nextInt();
                if(consulta != 0 && consulta != 1){
                    System.out.println("Por favor, apenas SIM[1] ou NÃO[0]. Tente novamente!");
                }
            }while(consulta != 0 && consulta != 1);
            scanner.nextLine();
        }while(consulta == 1);
        scanner.close();

    }

    public void exibeTabelaAliquotas() {
        System.out.println("\nTabela faixa de Imposto");
        System.out.println("Faixa 1: Até R$ 2.259: isento");
        System.out.println("Faixa 2: De 2.259,01 até 2.826,66: 7,5%");
        System.out.println("Faixa 3: De 2.826,67 até 3.751,06: 15%");
        System.out.println("Faixa 4: De 3.751,07 até 4.664,68: 22,5%");
        System.out.println("Faixa 5: Acima de R$ 4.664,68: 27,5%");
    }
}




