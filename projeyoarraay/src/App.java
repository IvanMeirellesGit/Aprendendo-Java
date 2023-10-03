public class App {
    public static void main(String[] args) {

        LinguagensProgramacao linguagensProgramacao = new LinguagensProgramacao();

        linguagensProgramacao.AdcionarLinguagem("Java");
        linguagensProgramacao.AdcionarLinguagem("C#");
        linguagensProgramacao.AdcionarLinguagem("Python");
        linguagensProgramacao.AdcionarLinguagem("JavaScrip");

        linguagensProgramacao.MostrarArrayList();
        linguagensProgramacao.ConverterParaArray();
    }
}