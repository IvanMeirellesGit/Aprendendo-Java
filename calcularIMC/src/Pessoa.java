public class Pessoa {
    private String nome;
    public int idade;
    protected String sexo;
    double peso;
    double altura;

    public void calcularIMC(double pes, double alt) {
        double imc, pes, alt;
        peso = pes;
        altura = alt;
        imc = peso / (altura * altura);
    }
}