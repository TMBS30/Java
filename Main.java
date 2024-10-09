//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String args[]) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e) {
            System.out.println(" A frase inicial está nula, para solucional tal o problema, foi lhe atribuito um valor defalt.");
                frase = "Frase vazia";
            novaFrase = frase.toUpperCase();
        }
        System.out.println("Frase antiga:" + frase) ;
        System.out.println("Frase nova:" + novaFrase);
    }
}