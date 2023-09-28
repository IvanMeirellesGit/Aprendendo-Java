public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Yan";
        // p.comissao = 8.4;

        Vendedor v = new Vendedor();
        v.nome = "Laís";
        v.comissao = 8.4;

        System.out.println(v.nome + " " + v.comissao);
    }
}