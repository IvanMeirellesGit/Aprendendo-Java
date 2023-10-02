public class App {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bidu");

        Gato gato = new Gato();
        gato.setNome("Lola");

        Leao leao = new Leao();
        leao.setNome("Lion");
        leao.setPeso(387.0);

        cachorro.Mostrar();
        gato.Mostrar();

        leao.Rugir();
        System.out.println("Peso do Leão: " + leao.getPeso());
    }
}