public class App {
    public static void main(String[] args) {
        Conta cp = new Poupanca();
        cp.setSaldo(5000);
        cp.imprimeExtrato();

        Conta cr = new Corrente();
        cr.setSaldo(2500);
        cr.imprimeExtrato();
    }
}