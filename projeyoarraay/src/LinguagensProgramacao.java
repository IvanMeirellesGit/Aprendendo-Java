import java.util.ArrayList;
import java.util.List;

public class LinguagensProgramacao {

    private List<String> linguagens;

    // Instanciei meu objeto Arraylist
    // Informaçoes na memoria ficam distantes, espalhadas
    public LinguagensProgramacao() {
        linguagens = new ArrayList<>();

    }

    public void AdcionarLinguagem(String Linguagem) {
        linguagens.add(Linguagem);
    }

    // Mostra o Arraylist
    public void MostrarArrayList() { // Mostra arraylist
        System.out.println("ArrayList: " + linguagens);
    }

    public void ConverterParaArray() {
        String[] arr = new String[linguagens.size()]; // Instanciando meu array
        linguagens.toArray(arr); // Convertendo ArrayList para array
        System.out.println("Array: ");
        for (String item : arr) { // No array os dados ficam organizados um ao lado do outro na memoria.
            System.out.println(item + ", ");
        }
    }

}