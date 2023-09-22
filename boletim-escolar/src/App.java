public class App {
    public static void main(String[] args) {

        double[] notasCarlos = new double[4];

        double media;

        notasCarlos[0] = 4;
        notasCarlos[1] = 8;
        notasCarlos[2] = 6;
        notasCarlos[3] = 8;

        media = (notasCarlos[0] + notasCarlos[1] + notasCarlos[2] + notasCarlos[3]) / 4;

        System.out.println("A mádia de notas do Carlos é: " + media);
    }
}