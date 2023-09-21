import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner entradabanda = new Scanner(System.in);
        Scanner quantidadeBanda = new Scanner(System.in);

        ArrayList<String> bandas = new ArrayList<String>();

        System.out.println("Quantas bandas quer adicionar?");

        int valor = quantidadeBanda.nextInt();

        if (valor != 0) {
            for (int i = 0; i < valor; i++)
                bandas.add(entradabanda.nextLine());
        }

        while (!bandas.isEmpty()) {
            System.out.println(bandas.remove(0));
        }
    }
}