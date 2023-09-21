import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // Criando ArrayList
        ArrayList<String> estados = new ArrayList<>();

        // Add valores no array
        estados.add("Espirito Santo");
        estados.add("Rio de Janeiro");
        estados.add("Ceará");
        estados.add("Pernambuco");

        estados.remove("Ceará");

        estados.contains("Amazonas");
        
    }
}