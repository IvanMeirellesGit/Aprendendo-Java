import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Digite um numero ou 99 para sair:");
        } while (opcao != 99){
            Scanner entrada = new Scanner(System.in);
            opcao = entrada.nextInt();
        }
    }
}