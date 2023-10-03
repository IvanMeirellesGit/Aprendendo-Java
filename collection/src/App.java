import java.util.ArrayList;
import java.util.Iterator; //Ajuda a caminhar por dentro do ArrayList


public class App {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);

        System.out.println("ArrayList: " + numeros);

        // Criando uma instancia de Iterator
        Iterator<Integer> it = numeros.iterator();

        // Pegar numero da lista
        // int numero = it.next();
        // System.out.println("Elemento: " + numero);

        // Mostrar cada valor da Lista
        while (it.hasNext()) {
            it.forEachRemaining((value) -> System.out.print(value + ", "));
        }

    }
}