import java.util.Scanner;

class App {
    public static void main(String[] args) {
        System.out.println("Programa iniciado!");
        System.out.println("Digite seu nome: ");

        String nome;
        Scanner entrada = new Scanner(System.in);
        nome = entrada.next();

        System.out.println("Bem vindo! " + nome);
    }
}