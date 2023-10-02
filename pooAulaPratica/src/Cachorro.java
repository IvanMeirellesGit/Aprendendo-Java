public class Cachorro extends Animal {

    private String proprietario;

    public String getProprietario() {
        return proprietario;
    }

    public void setproprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void Comer() {
        System.out.println("Gosto de comer ração de cachorro");
    }

    public void Latir() {
        System.out.println("Gosto de latir!!");
    }

    public void Mostrar() {
        System.out.println("Meu nome é: " + getNome());
    }
}