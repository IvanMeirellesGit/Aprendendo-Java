import java.util.Scanner; //Importando Scanner para entrada de dados

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("Digite um valor:");
            int numero1 = entrada.nextInt();

            System.out.println(numero1);
        } catch (Exception ex) {
            System.out.println("ERRO - O Valor digitado não é um número");
        }
    }
}