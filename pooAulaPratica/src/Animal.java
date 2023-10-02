public class Animal {

    private String nome;
    private String cor;

    public void setNome(String n) {
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void Comer() {
        System.out.println("Eu gosto de comer");
    }
}
