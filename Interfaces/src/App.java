public class App {
    public static void main(String[] args) {

        Conta cp = new Poupanca();
        cp.depositar(850);
        cp.sacar(12);

        System.out.println(cp.getSaldo());
        System.out.println("Teste");

    }
}