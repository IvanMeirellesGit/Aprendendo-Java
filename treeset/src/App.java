import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<Integer> numeros = new TreeSet<>(); // Instanciando TreeSet na memoria

        // Adicionando numeros a lista
        numeros.add(8);
        numeros.add(5);
        numeros.add(6);

        // Mostrando a lista no terminal
        System.out.println("TreeSet: " + numeros);

        // Removendo numeros da lista

        boolean result = numeros.remove(6);

        if (result) {
            System.out.println("Removido com sucesso!");
        } else {
            System.out.println("Não Removido!");
        }
        System.out.println("TreeSet: " + numeros);

        // Remove todos os itens da lista
        // numeros.removeAll(numeros)

    }
}